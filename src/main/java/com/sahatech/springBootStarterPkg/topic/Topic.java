package com.sahatech.springBootStarterPkg.topic;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private int id;	
	private String subjectName;
	private String credit;
	
	
	
	@Override
	public String toString() {
		return "Topic [id=" + id + ", subjectName=" + subjectName + ", credit=" + credit + "]";
	}


	public Topic() {
	}
	
	
	public Topic(int id, String subjectName, String credit) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.credit = credit;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}


	public String getSubjectname() {
		return subjectName;
	}


	public void setSubjectname(String subjectName) {
		this.subjectName = subjectName;
	}
	
	

}
