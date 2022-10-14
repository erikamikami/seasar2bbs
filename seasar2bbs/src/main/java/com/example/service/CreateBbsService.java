package com.example.service;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;

import com.example.entity.Bbs;
import com.example.form.BbsCreateForm;

public class CreateBbsService {

	@Resource
	protected JdbcManager jdbcManager;

	/**
	 * 掲示板の登録を行う
	 * @return
	 */
	public int insert(BbsCreateForm form){
		Bbs bbs = form.tranceformToBbs();
		bbs.createdAt = new Timestamp(System.currentTimeMillis());
		bbs.updatedAt = new Timestamp(System.currentTimeMillis());
		int count = jdbcManager.insert(bbs).execute();
		return count;
	}

}
