package com.example.action;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.seasar.framework.aop.interceptors.MockInterceptor;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.annotation.EasyMock;

import com.example.form.UserRegisterForm;
import com.example.service.UserRegisterService;

@RunWith(Seasar2.class)
public class UserRegisterActionTest {

	@EasyMock
	private UserRegisterService userRegisterService;

	public void testRegister() {
		// アクションのインスタンス作成
		UserRegisterAction action = new UserRegisterAction();

		// サービスのモックを作成
		MockInterceptor mock = new MockInterceptor();
		mock.setReturnValue("userResister", 1);
		action.userRegisterService = (UserRegisterService) mock.createProxy(UserRegisterService.class);

		// アクションフォームに値を設定
		UserRegisterForm form = new UserRegisterForm();
		form.name = "鈴木次郎";
		form.genderId = "1";
		form.email = "suzuki_ichiro@example.com";
		form.password = "suzuki_ichiro_password";
		// expect(userRegisterService.userResister(form)).andReturn(1);

		// 実行
		String returnJsp = action.register();

		// 戻り値確認
		assertEquals(returnJsp, "user_register_comp.jsp");

	}

}
