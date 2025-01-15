package SetterDI_BeanXML.Beans;

public class Address {
    String city;
    String state;

    public void setCity(String city) {
        System.out.println("set city");
        this.city = city;
    }

//    public String getCity() {
//        return city;
//    }

    public void setState(String state) {
        System.out.println("set state1");
        this.state = state;
        System.out.println("set state2");
    }

//    public String getState() {
//        return state;
//    }

    public String toString() {
        return city + "---" + state;
    }
}
