// This program calculates the grade of a student based on the marks entered by user in each subject.
// Program prints the grade based on this logic.
// If the average of marks is >= 80 then prints Grade 'A'
// If the average is <80 and >=60 then prints Grade 'B'
// If the average is <60 and >=40 then prints Grade 'C'
// else prints Grade 'D'


import java.util.Arrays;
import java.util.Scanner;

public class GreadMarks {

    static String calculateGread(int totalMarks){
        if (totalMarks >= 80) {
            return "Grade 'A'";
        }else if (totalMarks <80 && totalMarks >=60) {
            return "Grade 'B'";
        }else if (totalMarks <60 && totalMarks >=40) {
            return "Grade 'C'";
        }else {
            return "Grade 'D'";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the Total Number of subjects\n");
        int totalSubject = scan.nextInt();
        int subjectMarksArray[] = new int[totalSubject];
        for (int i = 0; i < totalSubject; i++) {
            System.out.println(i+1+" subject Mark");
            subjectMarksArray[i] = scan.nextInt();
        }
        scan.close();
        int totalMarks = Arrays.stream(subjectMarksArray).sum()/totalSubject;
    System.out.println("Total Marks "+ totalMarks +" " + calculateGread(totalMarks));
    }
}
