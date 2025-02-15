import java.util.Arrays;

public class SearchChallenge {
    
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1; 
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);  
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  
            } else if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};  
        int target = 3;
        
        int missingNumber = firstMissingPositive(nums);
        System.out.println("First Missing Positive Integer: " + missingNumber);

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int index = binarySearch(sortedArray, target);
        System.out.println("Index of Target " + target + ": " + index);
    }
}