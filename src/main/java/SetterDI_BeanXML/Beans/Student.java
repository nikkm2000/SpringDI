package SetterDI_BeanXML.Beans;

public class Student {
    String name;
    Address address;

    public void setName(String name) {
        System.out.println("set name");
        this.name = name;
    }
    public void setAddress(Address address) {
        System.out.println("set address");
        this.address = address;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
