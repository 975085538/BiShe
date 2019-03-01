package com.yhj.BiShe.student.service;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.activiti.engine.impl.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.yhj.BiShe.student.entity.Student;
import com.yhj.BiShe.student.repository.StudentRepository;

@Service
@Transactional
public class StudentService implements IStudentService{

	//调用Repository方法
	@Autowired
	private StudentRepository studentRepository;
	
	/* 
	 * 添加操作
	 */
	public Student save(Student entity) {
		return studentRepository.save(entity);
	}

	/* 
	 * 根据id判断是否存在
	 */
	public boolean existsById(String id) {
		return studentRepository.existsById(id);
	}
	
	/* 
	 * 根据id删除
	 */
	public void deleteById(String id) {
		studentRepository.deleteById(id);
	}

	
	/* 
	 * 删除全部
	 */
	public void deleteAll(String[] ids) {
		List<String> idLists = new ArrayList<String>(Arrays.asList(ids));
		List<Student> employees = (List<Student>) studentRepository.findAllById(idLists);
		if(employees!=null) {
			studentRepository.deleteAll(employees);
		}
	}
	
	/* 
	 * 根据id查找
	 */
	public Optional<Student> findById(String id) {
		return studentRepository.findById(id);
	}
	
	/* 
	 * 分页查找
	 */
	public Page findAll(Specification<Student> spec, Pageable pageable) {
		return null;
	}
}
