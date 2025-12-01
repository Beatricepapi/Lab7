package ie.atu.week2;

public class Customer extends Person
{
    private int customerNumber;
    private boolean mailingList;

    public Customer() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }

    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
}
