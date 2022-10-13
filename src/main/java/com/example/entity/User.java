package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {

	@Column(name="id")
	public int id;
	@Column(name="name")
	public String name;
	@Column(name="gender_id")
	public int genderId;
	@Column(name="email")
	public String email;
	@Column(name="password")
	public String password;
	@Column(name="admin_id")
	public int adminId;
	@Column(name="is_deleted")
	public boolean isDeleted;

}
