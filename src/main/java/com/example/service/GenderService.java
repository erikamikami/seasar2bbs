package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import com.example.entity.Gender;

public class GenderService {

	@Resource
	public JdbcManager jdbcManager;

	public List<Gender> test(){
		List<Gender> genderList = jdbcManager.from(Gender.class).getResultList();
		return genderList;
	}

}
