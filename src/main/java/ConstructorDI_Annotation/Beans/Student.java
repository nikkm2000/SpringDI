package ConstructorDI_Annotation.Beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;

    @Autowired
    private Address address;

    @Autowired
    private Subject subject;

//    public Student(String name, Address address, Subject subject) {
//        this.name = name;
//        this.address = address;
//        this.subject = subject;
//    }
public Student(String name) {
    this.name = name;
//    this.address = address;
//    this.subject = subject;
}

    public void display() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(subject);
    }

}
