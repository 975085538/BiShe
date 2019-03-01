package com.yhj.BiShe.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@Column(name="ID_",length=64)
	private String s_id;				//学生id
	
	@Column(name="PWD_")
	private String s_password;		//学生密码
	
	@Column(name="NAME_")
	private String s_name;			//学生姓名
	
	@Column(name="PFS_")
	private String s_profression;	//学生专业
	
	
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getS_password() {
		return s_password;
	}
	public void setS_password(String s_password) {
		this.s_password = s_password;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_profression() {
		return s_profression;
	}
	public void setS_profression(String s_profression) {
		this.s_profression = s_profression;
	}
	
}
