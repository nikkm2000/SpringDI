package com.example.springDI.SetterDI.Beans;
import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    String name;
//    @Autowired
    Address address;
//    @Autowired
    Subject subject;

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Subject: " + subject);
    }


}
