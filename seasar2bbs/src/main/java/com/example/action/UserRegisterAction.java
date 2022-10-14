package com.example.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;
import org.seasar.struts.exception.ActionMessagesException;

import com.example.entity.User;
import com.example.form.UserRegisterForm;
import com.example.service.UserRegisterService;

/**
 * Userを登録するアクションクラスです
 */
public class UserRegisterAction {

	@Resource
	@ActionForm
	protected UserRegisterForm userRegisterForm;

	@Resource
	protected UserRegisterService userRegisterService;

	/**
	 * ユーザー登録画面へ遷移
	 * @return ユーザー登録画面
	 */
	@Execute(validator=false)
	public String index(){
		return "user_register_form.jsp";
	}

	/**
	 * Userの登録
	 * @return 登録完了画面
	 */
	@Execute(validator=true, input="user_register_form.jsp")
	public String register(){
		// メールアドレスが重複していないかチェック
		User user = userRegisterService.findByEmail(userRegisterForm.email);
		if(user != null){
			throw new ActionMessagesException("このメールアドレスでは登録できません", false);
		}

		userRegisterService.userResister(userRegisterForm);
		return "user_register_comp.jsp";
	}

}