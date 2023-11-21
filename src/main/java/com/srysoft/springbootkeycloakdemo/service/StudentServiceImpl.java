package com.srysoft.springbootkeycloakdemo.service;

import com.srysoft.springbootkeycloakdemo.entity.Student;
import com.srysoft.springbootkeycloakdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long studentId) {
        final Optional<Student> student = studentRepository.findById(studentId);

        if (student.isPresent())
            return student.get();
        else
            return new Student();
    }
}
