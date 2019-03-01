package com.yhj.BiShe.student.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.yhj.BiShe.student.entity.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, String>,JpaSpecificationExecutor<Student>{

}
