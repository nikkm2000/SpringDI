package com.example.springDI.ConstructorDI.Beans;

public class Address {
    private String street;
    private String city;

public Address(String street, String city) {
    this.street = street;
    this.city = city;
}

    public String toString(){
        return street + "---" + city ;
    }


}
