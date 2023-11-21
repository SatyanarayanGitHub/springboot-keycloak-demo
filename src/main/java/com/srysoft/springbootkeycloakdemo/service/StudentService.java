package com.srysoft.springbootkeycloakdemo.service;

import com.srysoft.springbootkeycloakdemo.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student getStudentById(Long studentId);
}
