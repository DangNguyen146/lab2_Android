package com.example.lab2;



public abstract class Employee {
    private String id;
    private String name;
    public abstract Double tinhLuong();
    public  String toString(){
        return getId()+" - "+getName()+" --> ";
    }

    public  String getName(){
        return name;
    };

    public String getId() {
        return  id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
