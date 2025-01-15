package com.example.springDI.SetterDI.Beans;

public class Subject {
    private int marks;
    private String subName;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String toString() {
        return "subject name->" + subName + " marks->" + marks;
    }
}
