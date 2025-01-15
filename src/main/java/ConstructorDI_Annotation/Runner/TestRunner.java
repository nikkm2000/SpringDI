package ConstructorDI_Annotation.Runner;

import ConstructorDI_Annotation.Beans.Student;
import ConstructorDI_Annotation.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRunner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student st1 = context.getBean(Student.class);
        st1.display();
    }
}
