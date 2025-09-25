import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value to search:");
        int value = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;  
            if (arr[mid] == value) {
                index = mid;  
                break;
            } else if (value < arr[mid]) //ascending order
            // else if (value > arr[mid]) //for descending order
            {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + index);
        }
        sc.close();
    }
}