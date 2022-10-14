package com.example.action;

import javax.annotation.Resource;

import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.example.entity.Employee;
import com.example.form.InsertForm;

public class InsertAction {

	@Resource
	@ActionForm
	protected InsertForm insertForm;

	@Resource
	protected JdbcManager jdbcManager;

	@Execute(validator=false)
	public String index(){
		return "insert.jsp";
	}

	@Execute(validator=false)
	public String save(){
		Employee employee = new Employee();
		employee.transform(insertForm);
		System.out.println(employee);
		jdbcManager.insert(employee).execute();
		return "test.jsp";
	}

}
