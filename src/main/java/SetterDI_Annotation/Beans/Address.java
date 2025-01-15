package SetterDI_Annotation.Beans;

public class Address {
    private String city;
    private String state;

    public void setCity(String city) {
        System.out.println("set city");
        this.city = city;
    }

    public void setState(String state) {
        System.out.println("set state1");
        this.state = state;
        System.out.println("set state2");
    }

    public String toString() {
        return city + "---" + state;
    }
}
