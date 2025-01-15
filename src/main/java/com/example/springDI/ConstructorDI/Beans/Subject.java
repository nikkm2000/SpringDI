package com.example.springDI.ConstructorDI.Beans;

public class Subject {
    private int marks;
    private String subName;

    public Subject(int marks, String subName) {
        this.marks = marks;
        this.subName = subName;
    }
    public String toString(){
        return "subject name->"+subName+" marks->"+marks;
    }
}
