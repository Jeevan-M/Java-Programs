import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
       
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter the First Number");
            int number1 = scan.nextInt();
            System.out.println("Please Enter the second Number");
            int number2 = scan.nextInt();
            System.out.println("Please Select");
            System.out.println("1. Add");
            System.out.println("2. sub");
            System.out.println("3. div");
            System.out.println("4. mul");
            System.out.println("5. exit");
            int option = scan.nextInt();
            scan.close();
            
            switch (option) {
                case 1:
                    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                    break;
                case 2:
                    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                    break;
                case 3:
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                    break;
                case 4:
                    System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                    break;
                default:
                    System.out.println("Please select Correct Option");
                    break;
            }
        }
    }
}