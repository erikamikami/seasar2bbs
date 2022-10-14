package com.example.form;

import org.seasar.struts.annotation.EmailType;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;

import com.example.entity.User;


public class LoginForm {

	@Required(msg = @Msg(key = "メールアドレスを入力してください", resource = false))
	@EmailType(msg = @Msg(key = "メールアドレスの形式が不正です", resource = false))
	public String email;
	@Required(msg = @Msg(key = "パスワードを入力してください", resource = false))
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
