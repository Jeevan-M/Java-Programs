// Check whether String is palindrome using recursion
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userString = scan.nextLine();
        StringBuilder revString = new StringBuilder(userString).reverse();
        if (revString.toString().equals(userString)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
