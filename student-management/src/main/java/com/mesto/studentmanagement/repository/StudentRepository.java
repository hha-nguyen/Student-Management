package com.mesto.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mesto.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
