package com.example.entity;

public class Employee {
    private String employeeName;
    private String employeeAddress;
    private int employeeId;
    private Long employeePhone;

    public Employee(String employeeName, String employeeAddress, int employeeId, Long employeePhone) {
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeeId = employeeId;
        this.employeePhone = employeePhone;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Long getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(Long employeePhone) {
        this.employeePhone = employeePhone;
    }



}
