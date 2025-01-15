package ConstructorDI_BeanXML.Beans;

public class Student {
    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
