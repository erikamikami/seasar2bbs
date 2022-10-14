package com.example.form;

import com.example.entity.User;

public class LoginForm {

	public String email;
	public String password;

	/**
	 * LoginFormをUserに変換します
	 * @return
	 */
	public User transformToUser(){
		User user = new User();
		user.email = this.email;
		user.password = this.password;
		return user;
	}

}
