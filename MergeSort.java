import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void mergeSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        
        int mid=(start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int[] arr, int start, int mid, int end) {
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < rightSize; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = start;

        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < leftSize) {
            arr[k++] = left[i++];
        }

        while (j < rightSize) {
            arr[k++] = right[j++];
        }
    }

}