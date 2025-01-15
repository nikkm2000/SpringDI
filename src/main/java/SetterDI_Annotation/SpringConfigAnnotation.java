package SetterDI_Annotation;

import SetterDI_Annotation.Beans.Address;
import SetterDI_Annotation.Beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigAnnotation {

    @Bean
    public Student getStudent() {
        System.out.println("Student config java class");
        Student student = new Student();
        student.setName("Ram");
//        student.setAddress(getAddress());
        return student;
    }

    @Bean
    public Address getAddress() {
        System.out.println("address config java class");
        Address address = new Address();
        address.setCity("patna");
        address.setState("Bihar");
        return address;
    }

}
