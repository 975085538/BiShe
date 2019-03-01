package com.yhj.BiShe.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="t_admin")
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	@Id
	@Column(name="ID_",length=64)
	private String a_id;			//管理员id
	
	@Column(name="PWD_",length=64)
	private String a_password;		//管理员密码
	
	@Column(name="NAME_")
	private String a_name;			//管理员姓名
	
	
	public String getA_id() {
		return a_id;
	}
	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	public String getA_password() {
		return a_password;
	}
	public void setA_password(String a_password) {
		this.a_password = a_password;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	
}
