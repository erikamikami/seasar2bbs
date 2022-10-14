package com.example.form;

import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;

import com.example.entity.Bbs;

/**
 * 掲示板を作成する際のフォームです
 * @author erika
 *
 */
public class BbsCreateForm {

	@Required(msg=@Msg(key="タイトルを入力してください", resource=false))
	public String title;
	public Integer userId;

	public Bbs tranceformToBbs(){
		Bbs bbs = new Bbs();
		bbs.title = this.title;
		return bbs;
	}

}
