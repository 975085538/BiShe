package com.yhj.BiShe.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_teacher")
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	
	@Id
	@Column(name="ID_",length=64)
	private String t_id;			//老师id
	
	@Column(name="PWD_")
	private String t_password;		//老师密码
	
	@Column(name="NAME_")
	private String t_name;			//老师姓名
	
	@Column(name="PFS_")
	private String t_profression;	//老师专业
	
	public String getT_id() {
		return t_id;
	}
	public void setT_id(String t_id) {
		this.t_id = t_id;
	}
	public String getT_password() {
		return t_password;
	}
	public void setT_password(String t_password) {
		this.t_password = t_password;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_profression() {
		return t_profression;
	}
	public void setT_profression(String t_profression) {
		this.t_profression = t_profression;
	}
	
	
}
