package ConstructorDI_Annotation;

import ConstructorDI_Annotation.Beans.Address;
import ConstructorDI_Annotation.Beans.Student;
import ConstructorDI_Annotation.Beans.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {
    //    @Bean
//    public Student createStudent(){
//        Student st1= new Student("Ram",createAddress(), createSubject());
//        return st1;
//    }
    @Bean
    public Student createStudent() {
        Student st1 = new Student("Ram");
        return st1;
    }

    @Bean
    public Address createAddress() {
        Address addr1 = new Address("gzb", "UP");
        return addr1;
    }

    @Bean
    public Subject createSubject() {
        List<String> subjectList = new ArrayList<>();
        subjectList.add("Math");
        subjectList.add("Eng");
        Subject sub1 = new Subject(subjectList);
        return sub1;
    }

}
