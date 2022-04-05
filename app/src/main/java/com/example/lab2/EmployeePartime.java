package com.example.lab2;

public class EmployeePartime extends Employee {
    @Override
    public Double tinhLuong() {

        return 150.0;
    }

    @Override
    public String toString() {
        return super.toString()+"Parttime "+tinhLuong().toString();

    }
}
