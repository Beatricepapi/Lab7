package ie.atu.week2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Person firstPerson = new Person();
        firstPerson.setName("Beatrice");
        firstPerson.setAddress("Galway");
        firstPerson.setPhoneNumber("123456789");

        System.out.println(firstPerson.toString());
        Customer customer = new Customer();
        Customer customer2 = new Customer();
    }
}