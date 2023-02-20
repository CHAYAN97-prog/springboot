package com.code.springboot.service;

import com.code.springboot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();


    public Department fetchDepartmentbyId(Long departmentId);

    public void deleteDepartmentbyId(Long departmentId);

    public Department updateDatabase(Long departmentId, Department department);

    //public  Department fetchDepartmentbyName(String departmentName) ;

}
