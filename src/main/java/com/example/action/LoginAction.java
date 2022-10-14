package com.example.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.example.entity.User;
import com.example.form.LoginForm;
import com.example.service.LoginService;

/**
 * ログインを行うアクションです
 * @author erika
 *
 */
public class LoginAction {

	@Resource
	@ActionForm
	protected LoginForm loginForm;

	@Resource
	protected LoginService loginService;

	@Execute(validator=false)
	public String index(){
		return "login.jsp";
	}

	@Execute(validator=false)
	public String login(){
		User user = loginService.findByEmailAndPassword(loginForm);
		if(user.equals(null)){
			return "login.jsp";
		}
		return "success.jsp";
	}

}
