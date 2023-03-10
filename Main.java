import java.time.LocalDate;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Customer customer = new Customer("Daneker", "kkraken2005@gmail.com", "+707757584", LocalDate.of(2005, 11, 15));
        System.out.println(
                isValid.isEmailValid().and(isValid.isNameValid()).and(isValid.isPhoneValid()).apply(customer));
    }
}
