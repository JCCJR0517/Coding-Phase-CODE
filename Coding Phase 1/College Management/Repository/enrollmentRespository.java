package com.yourcompany.collegemanagement.repository;

import com.yourcompany.collegemanagement.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
