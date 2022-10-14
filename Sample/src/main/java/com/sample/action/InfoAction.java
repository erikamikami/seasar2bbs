package com.sample.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sample.form.InfoForm;

public class InfoAction {

	public String title;

	@ActionForm
	@Resource
	protected InfoForm infoForm;

	@Execute(validator=false)
	public String form(){
		this.title = "入力してください。";
		return "form.jsp";
	}

	@Execute(validator=false)
	public String index(InfoForm infoForm){
		this.title = "入力が完了しました。";
		return "index.jsp";
	}

}
