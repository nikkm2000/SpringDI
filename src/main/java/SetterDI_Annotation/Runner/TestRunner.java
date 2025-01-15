package SetterDI_Annotation.Runner;


import SetterDI_Annotation.Beans.Student;
import SetterDI_Annotation.SpringConfigAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAnnotation.class);
        Student student=context.getBean(Student.class);
        student.display();
    }
}
