import java.util.*;

public class PairWithSum {
    public static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 7, 8, 10};
        int target = 15;
        System.out.println(hasPairWithSum(nums, target));
    }
}