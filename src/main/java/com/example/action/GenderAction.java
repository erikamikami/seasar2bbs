package com.example.action;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import com.example.entity.Gender;
import com.example.service.GenderService;

public class GenderAction {

	@Resource
	protected GenderService genderService;

	@Execute(validator=false)
	public String test(){
		List<Gender> genderList = genderService.test();
		System.out.println(genderList);
		return "test.jsp";
	}

}
