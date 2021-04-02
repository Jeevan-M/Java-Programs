// We are gonna see how to accept input from user.
// We are using Scanner class to get the input.
// In the below example we are getting input String, integer and a float number.
// For this we are using following methods:
// 1) public String nextLine(): For getting input String
// 2) public int nextInt(): For integer input
// 3) public float nextFloat(): For float input

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userString = scan.nextLine();
        int userInteger = scan.nextInt();
        float userFloat = scan.nextFloat();
        System.out.println("String "+userString);
        System.out.println("Integer "+userInteger);
        System.out.println("Float "+userFloat);


    }
}
