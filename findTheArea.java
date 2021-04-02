//This program finds the area of square, rectangle and circle using method overloading.
// In this program we have three methods with same name area(),
// which means we are overloading area() method.
// By having three different implementation of area method,
// we are calculating the area of square, rectangle and circle.

import java.util.Scanner;

public class findTheArea {

    static double area(double radius){
        return 3.15*radius*radius;
    }

    static double area(float sides ){
        return sides*sides;
    }

    static double area(double length , double width){
        return length*width;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Select the Option to find the area \n 1. Square \n 2. Rectangle \n 3. Circle \n");
        int option = scan.nextInt();
        if (option == 3) {
            System.out.println("Circle");
            double radius = scan.nextDouble();
            System.out.println("Area of Circle "+ area(radius));
        }else if (option == 1) {
            System.out.println("Square");
            float sides = scan.nextFloat();
            System.out.println("Area of Square "+ area(sides));
        }else if (option == 2) {
            System.out.println("Rectangle");
            double length = scan.nextDouble();
            double width = scan.nextDouble();
            System.out.println("Area of Rectangle "+ area(length,width));
        }else {
            System.out.println("Please select the correct option\n");
        }
        scan.close();
    }
}
