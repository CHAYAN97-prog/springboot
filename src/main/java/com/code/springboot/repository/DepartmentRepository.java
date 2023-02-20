package com.code.springboot.repository;

import com.code.springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

  //public Department findByDepartmentName(String departmentName);

  //public Department findByDepartmentNameIgnoreCase(String departmentName);

}
