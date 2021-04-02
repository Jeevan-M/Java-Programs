//Java Program to Sort Strings in an Alphabetical Order

import java.util.Arrays;
import java.util.Scanner;

public class Alphabetical {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userString = scan.nextLine();
        char charArray[] = userString.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
    }
}
