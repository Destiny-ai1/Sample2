package com.example.demo.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Member {
	private String username;            //10글자
	private String password;			//60글자
	private String email;				//30글자
}
