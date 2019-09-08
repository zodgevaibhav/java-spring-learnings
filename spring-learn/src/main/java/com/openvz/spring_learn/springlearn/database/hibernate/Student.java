package com.openvz.spring_learn.springlearn.database.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@Column
	private int id;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;

	public Student(String firstName, String lastName) {
		this.first_name = firstName;
		this.last_name = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
}
