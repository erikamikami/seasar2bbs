package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.jdbc.where.SimpleWhere;

import com.example.entity.User;
import com.example.form.LoginForm;

public class LoginService {

	@Resource
	protected JdbcManager jdbcManager;

	/**
	 * emailとpasswordから該当のユーザーがいるか検索します
	 *
	 * @param form
	 * @return User or null
	 */
	public User findByEmailAndPassword(LoginForm form) {
		List<User> user = jdbcManager
				.from(User.class)
				.where(new SimpleWhere()
					.eq("email", form.email)
					.eq("password",form.password)
					)
					.getResultList();

		if(user.size()==0){
			return null;
		}
		return user.get(0);
	}

}
