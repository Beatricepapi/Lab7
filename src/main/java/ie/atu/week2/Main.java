package ie.atu.week2;

public class Main {
    public static void main(String[] args) {

        Person firstPerson = new Person("Beatrice", "Dublin", "33333");
        System.out.println(firstPerson);

        Customer myCustomer = new Customer("Beatrice", "Galway", "2222",
                12, true);
        System.out.println(myCustomer);

        PreferredCustomer pc = new PreferredCustomer("Paul Customer",
                "3 Middle Road", "0871112222", 2001, true, 700);
        System.out.println(pc);

        pc.addLoyaltyPoints(800);
        System.out.println(pc);
    }
}