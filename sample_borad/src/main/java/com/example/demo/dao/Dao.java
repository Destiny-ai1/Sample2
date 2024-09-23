package com.example.demo.dao;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Dao {
	@Select("select count(username) from member where username=#{username}")
	public int countbyusername(String username);
}
