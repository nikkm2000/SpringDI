package com.example.springDI.SetterDI.resources;

import com.example.springDI.SetterDI.Beans.Subject;
import com.example.springDI.SetterDI.Beans.Student;
import com.example.springDI.SetterDI.Beans.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Address createAdd() {
        Address addr = new Address();
        addr.setCity("del");
        addr.setStreet("rne");
        return addr;
    }
    @Bean
    public Subject createSubject(){
        Subject subject = new Subject();
        subject.setMarks(99);
        subject.setSubName("Math");
        return subject;
    }

    @Bean
    public Student createStudent() {
        Student st = new Student();
        st.setName("nikhil");
        st.setAddress(createAdd()); //manual DI
        return st;
    }
}
