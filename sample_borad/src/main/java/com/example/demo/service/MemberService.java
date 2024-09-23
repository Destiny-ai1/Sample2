package com.example.demo.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.example.demo.dao.*;

@Service
public class MemberService {
	@Autowired
	private Dao memberDao;
	
	public boolean 아이디사용확인(String username) {
		return memberDao.countbyusername(username)==0;
	}
}
