package com.hexawaretraining.department_service.repository;


import com.hexawaretraining.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

   Department findByDepartmentCode(String departmentCode);// Abstract method used to find the department by its code
}