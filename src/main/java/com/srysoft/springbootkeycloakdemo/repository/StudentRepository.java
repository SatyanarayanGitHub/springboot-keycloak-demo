package com.srysoft.springbootkeycloakdemo.repository;

import com.srysoft.springbootkeycloakdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
