package ConstructorDI_BeanXML.Beans;

public class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }


    public String toString() {
        return city + "---" + state;
    }
}
