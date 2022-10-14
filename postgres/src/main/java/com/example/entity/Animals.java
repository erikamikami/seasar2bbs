package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="animals")
public class Animals {

	@Column(name="name")
	public String name;

	@Override
	public String toString() {
		return "Animals [name=" + name + "]";
	}


}
