import java.util.Arrays;
import java.util.List;

/**
 *
 * This class is to be used to show the benefits of using streams and lambdas for dealing with collections
 *
 * @author a.gizaw
 */
public class MAIN {

    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Adam", "Jon", 30),
                new Customer("Peter", "Hugo", 18),
                new Customer("Joanne", "Carrol", 50),
                new Customer("Mattew", "Arnold", 38),
                new Customer("Charlote", "Ben", 20),
                new Customer("Thomas", "Carlyle", 20)
        );
    }
}
