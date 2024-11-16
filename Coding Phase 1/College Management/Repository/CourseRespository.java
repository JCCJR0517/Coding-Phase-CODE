package com.yourcompany.collegemanagement.repository;

import com.yourcompany.collegemanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
