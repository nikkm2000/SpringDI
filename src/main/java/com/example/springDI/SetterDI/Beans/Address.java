package com.example.springDI.SetterDI.Beans;

public class Address {
    private String street;
    private String city;

    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String toString(){
        return "street-- "+street+"  city---"+city;
    }
}
