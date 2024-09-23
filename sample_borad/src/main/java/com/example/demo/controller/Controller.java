package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.example.demo.entity.*;
import com.example.demo.service.*;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private MemberService service;
	
	@GetMapping("/index")
	public @ResponseBody Member index() {
		return new Member("Spring", "1234","Spring@naver.com");
	}
	
	@GetMapping("/member/username/check")
	public ResponseEntity<?> 아이디사용확인(@RequestParam String username){
		boolean result = service.아이디사용확인(username);
		if(result) {
			return ResponseEntity.status(200).body("사용가능합니다");
		}else {
			return ResponseEntity.status(500).body("사용중이거나중복입니다.");
		}
	}
	
	@GetMapping("/member/join")
	public ModelAndView join() {
		return new ModelAndView("member/join");
	}
}