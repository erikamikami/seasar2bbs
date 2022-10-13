package com.example.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.extension.dataset.DataSet;
import org.seasar.framework.unit.DataAccessor;
import org.seasar.framework.unit.PreparationType;
import org.seasar.framework.unit.Seasar2;
import org.seasar.framework.unit.TestContext;

import com.example.form.UserRegisterForm;

@RunWith(Seasar2.class)
public class UserRegisterServiceTest {

	private TestContext context;
	private DataAccessor dataAccessor;

	// テスト対象クラス
	private UserRegisterService userRegisterService;

	// テストクラス実行前に1度実行
	public void before(){
		// テーブルのデータを削除してから挿入する
		context.setPreparationType(PreparationType.ALL_REPLACE);

	}

	/**
	 * ユーザーを1件登録できているか
	 */
	@Test
	public void testUserResister() {
		UserRegisterForm form = new UserRegisterForm();
		form.name = "鈴木次郎";
		form.genderId = "1";
		form.email = "suzuki_ichiro@example.com";
		form.password = "suzuki_ichiro_password";

		userRegisterService.userResister(form);

		System.out.println(getClass().getResource("").getPath());

		// 期待値のDatasetを取得
		DataSet expect = context.getExpected();

		// DB内容のDataset取得
		DataSet actual = dataAccessor.readDb(expect);

		// 期待値とDBの内容を比較
		assertEquals(expect, actual);
	}

}
