package com.code.springboot.controller;

import com.code.springboot.entity.Department;
import com.code.springboot.service.DepartmentService;
import com.code.springboot.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }
    @GetMapping("/departments/{id}")
    public  Department fetchDepartmentbyId(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentbyId(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public  String deleteDepartmentbyId(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentbyId(departmentId);
        return "deleted";

    }

    @PutMapping("/departments/{id}")
    public Department updateDatabase(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDatabase(departmentId,department);
    }

   /* @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentbyName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentbyName(departmentName);
    }*/
}
