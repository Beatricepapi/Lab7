package ie.atu.week2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Person firstPerson = new Person("Beatrce", "Dublin", "33333");
        System.out.println(firstPerson.toString());
        Customer myCustomer = new Customer("Beatrice", "Galway", "2222",
                12, true);
        System.out.println(myCustomer.toString());
    }
}