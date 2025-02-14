import java.util.Arrays;

public class Quicksort {
    public static void quickSort(int[] a, int low, int hi) {
        if (low < hi) {
            int partitionIndex = partition(a, low, hi);
            quickSort(a, low, partitionIndex - 1);
            quickSort(a, partitionIndex + 1, hi);
        }
    }

    private static int partition(int[] a, int low, int hi) {
        int pivot = a[low]; 
        int i = low, j = hi;

        while (i < j) {
            while (i <= hi  && a[i] <= pivot) 
                i++;
            while (j >= low && a[j] > pivot) 
                j--;
            if (i < j) 
                swap(a, i, j);
        }

        swap(a, low, j); 
        return j;

    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
      
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}