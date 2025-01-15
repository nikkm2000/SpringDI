package ConstructorDI_BeanXML.Runner;



import ConstructorDI_BeanXML.Beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRunner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConstructorDI_XML.xml");
        Student student1=(Student)context.getBean("studentId");
        student1.display();
    }
}
