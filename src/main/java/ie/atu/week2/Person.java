package ie.atu.week2;

public class Person {
    private String name;
    private String address;
    private String PhoneNumber;

    public Person() {
        this.name = "";
        this.address = "";
        this.PhoneNumber = "";
    }

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", PhoneNumber='" + PhoneNumber + "'";
    }
}

