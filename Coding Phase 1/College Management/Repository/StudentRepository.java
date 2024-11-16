package com.yourcompany.collegemanagement.repository;

import com.yourcompany.collegemanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
