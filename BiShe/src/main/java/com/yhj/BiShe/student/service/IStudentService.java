package com.yhj.BiShe.student.service;

import java.awt.print.Pageable;
import java.util.Optional;

import org.activiti.engine.impl.Page;
import org.springframework.data.jpa.domain.Specification;

import com.yhj.BiShe.student.entity.Student;

public interface IStudentService {
	public Student save(Student entity);
	public void deleteById(String id);
	public void deleteAll(String[] ids);
	public boolean existsById(String id);
	
	public Optional<Student> findById(String id);
	public Page findAll(Specification<Student> spec, Pageable pageable);
}
