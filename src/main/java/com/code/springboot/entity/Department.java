package com.code.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long DepartmentId;
    private String DepartmentName;
    private String DepartmentCode;
    private String DepartmentAddress;

    public long getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Long departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    public String getDepartmentCode() {
        return DepartmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        DepartmentCode = departmentCode;
    }

    public String getDepartmentAddress() {
        return DepartmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        DepartmentAddress = departmentAddress;
    }

    public Department() {
    }

    public Department(Long departmentId, String departmentName, String departmentCode, String departmentAddress) {
        DepartmentId = departmentId;
        DepartmentName = departmentName;
        DepartmentCode = departmentCode;
        DepartmentAddress = departmentAddress;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentId=" + DepartmentId +
                ", DepartmentName='" + DepartmentName + '\'' +
                ", DepartmentCode='" + DepartmentCode + '\'' +
                ", DepartmentAddress='" + DepartmentAddress + '\'' +
                '}';
    }
}
