import java.util.Arrays;
import java.util.Scanner;

public class BS {
    static int binarySearch(int array[], int element, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == element)
                return mid;
            if (array[mid] < element)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the size of Array\n");
        int sizeOfArray = scan.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray ; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Enter element to be searched:");
        int element = scan.nextInt();
        scan.close();
        int result = binarySearch(array, element, 0, sizeOfArray - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
