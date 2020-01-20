import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * This class is to be used to show the benefits of using streams and lambdas for dealing with collections
 *
 * @author a.gizaw
 */
public class CustomerReport {

    public static List<Customer> customers;

    public CustomerReport(){
        customers = Arrays.asList(
                new Customer("Adam", "Jon", 30),
                new Customer("Peter", "Hugo", 18),
                new Customer("Joanne", "Carrol", 50),
                new Customer("Mattew", "Arnold", 38),
                new Customer("Charlote", "Ben", 20),
                new Customer("Thomas", "Carlyle", 20)
        );
    }

    public static void main(String[] args) {
        new CustomerReport();

    }

    //Exercise

    //1. Sort list by last name
    public static void sortJava7(){
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer1.getLastName().compareTo(customer2.getLastName());
            }
        });
    }

    public static void sortJava8(){
        Collections.sort(customers, (Customer c1, Customer c2) -> c1.getLastName().compareTo(c2.getLastName()));
    }
    //2. Print all customer information

    //3. Extract all customers age less than or equal to 20
}
