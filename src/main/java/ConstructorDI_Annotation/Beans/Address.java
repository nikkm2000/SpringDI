package ConstructorDI_Annotation.Beans;

public class Address {
    private String city;
    private String street;

    public Address(String city, String street){
        this.city = city;
        this.street = street;
    }

    public String toString(){
        return city + " " + street;
    }

}
