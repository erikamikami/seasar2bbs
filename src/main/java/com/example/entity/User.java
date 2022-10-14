package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {

	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	@Column(name="name")
	public String name;
	@Column(name="gender_id")
	public int genderId;
	@Column(name="email")
	public String email;
	@Column(name="password")
	public String password;
	@Column(name="admin_id")
	public Integer adminId = 1;
	@Column(name="is_deleted")
	public boolean isDeleted;

}
