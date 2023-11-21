package com.srysoft.springbootkeycloakdemo.controller;

import com.srysoft.springbootkeycloakdemo.entity.Student;
import com.srysoft.springbootkeycloakdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        //return new ResponseEntity<List<Student>>(allStudents, HttpStatus.OK);
        return ResponseEntity.ok(allStudents);

    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getAllStudents(@PathVariable("id") Long studentId) {
        Student student = studentService.getStudentById(studentId);

        //return new ResponseEntity<Student>(student, HttpStatus.OK);
        return ResponseEntity.ok(student);
    }


}
