package com.example.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.example.entity.Bbs;
import com.example.form.CreateCommentForm;
import com.example.service.CreateCommentService;
import com.example.service.SearchBbsService;

public class DetailBbsAction {

	public Bbs bbs;

	@Resource
	@ActionForm
	protected CreateCommentForm createCommentForm;

	@Resource
	protected SearchBbsService searchBbsService;

	@Resource
	protected CreateCommentService createCommentService;


	/**
	 * 掲示板詳細画面
	 * @return
	 */
	@Execute(validator=false, urlPattern="{bbsId}")
	public String index(){
		int bbsId = Integer.parseInt(createCommentForm.bbsId);
		bbs = searchBbsService.findDetail(bbsId);
		System.out.println(bbs);
		return "bbs_detail.jsp";
	}

	/**
	 * コメント投稿
	 * @return
	 */
	@Execute(validator=false)
	public String createComment(){
		createCommentService.insert(createCommentForm);
		return "/detailBbs/" + createCommentForm.bbsId + "?redirect=true";
	}

}
