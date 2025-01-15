package com.example.springDI.ConstructorDI.Beans;
import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    String name;
//    @Autowired
    Address address;
//    @Autowired
    Subject subject;

    public Student(String name, Address address, Subject subject) {
        this.name = name;
        this.address = address;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Subject: " + subject);
    }
}
