package com.example.springDI.SetterDI.Runner;

import com.example.springDI.SetterDI.Beans.Student;
import com.example.springDI.SetterDI.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student=context.getBean(Student.class);
        student.display();
    }
}
