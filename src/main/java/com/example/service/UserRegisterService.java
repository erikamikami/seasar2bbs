package com.example.service;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import com.example.entity.User;
import com.example.form.UserRegisterForm;

public class UserRegisterService {

	@Resource
	public JdbcManager jdbcManager;

	/**
	 * Userを1件登録します
	 * @param UserRegisterForm
	 * @return 登録した件数（期待値は1件）
	 */
	public int userResister(UserRegisterForm form){
		User user = form.transformToUser();
		int count = jdbcManager.insert(user).execute();
		return count;
	}

}
