import java.util.*;

public class Performance_Linear_Binary_Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Element to search");
        int target = sc.nextInt();

        long start = System.nanoTime();
        int linearSearchIndex = linearSearch(arr, target);
        long end = System.nanoTime();

        if (linearSearchIndex != -1) {
            System.out.println("Element found at index: " + linearSearchIndex);
        }
        else {
            System.out.println("Element not found in the array.");
        }

        System.out.println("Time taken by Linear Search: " + (end - start) + " nanoseconds");

        start = System.nanoTime();
        int binarySearchIndex = binarySearch(arr, target);
        end = System.nanoTime();

        if (binarySearchIndex != -1) {
            System.out.println("Element found at index: " + binarySearchIndex);
        }
        else {
            System.out.println("Element not found in the array.");
        }

        System.out.println("Time taken by Binary Search: " + (end - start) + " nanoseconds");

        sc.close();
    }

    public static int linearSearch(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return index;
    }
}