package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gender")
public class Gender {

	@Column(name="id")
	public int id;
	@Column(name="gender")
	public String gender;

	@Override
	public String toString() {
		return "Gender [id=" + id + ", gender=" + gender + "]";
	}

}
