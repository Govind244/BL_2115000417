import java.util.*;

public class ZeroSumSubarrays {
    public static int countZeroSumSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;

        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int result = countZeroSumSubarrays(nums);
        System.out.println("Total zero-sum subarrays: " + result);
    }
}