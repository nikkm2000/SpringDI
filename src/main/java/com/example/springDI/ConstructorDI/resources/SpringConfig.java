package com.example.springDI.ConstructorDI.resources;

import com.example.springDI.ConstructorDI.Beans.Address;
import com.example.springDI.ConstructorDI.Beans.Student;
import com.example.springDI.ConstructorDI.Beans.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Address createAdd() {
        Address addr = new Address("rne","del");
        return addr;
    }
    @Bean
    public Subject createSubject(){
        Subject subject = new Subject(98,"Math");
        return subject;
    }

    @Bean
    public Student createStudent() {
        Student st = new Student("Ram",createAdd(),createSubject());
        return st;
    }
}
