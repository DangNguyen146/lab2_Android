package com.example.lab2;

public class EmployeeFulltime extends Employee {
    @Override
    public Double tinhLuong() {
        return 500.0;
    }

    @Override
    public String toString() {
        return super.toString()+"Fulltime "+tinhLuong().toString();
    }
}
