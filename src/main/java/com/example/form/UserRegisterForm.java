package com.example.form;

import com.example.entity.User;


public class UserRegisterForm {

	public String name;
	public String genderId;
	public String email;
	public String password;

	/**
	 * UserRegisterFormをUserに変換します
	 * @return 変換後のUser
	 */
	public User transformToUser(){
		User user = new User();
		user.name = this.name;
		user.genderId = Integer.parseInt(this.genderId);
		user.email = this.email;
		user.password = this.password;
		return user;
	}

}
