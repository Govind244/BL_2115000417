import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {
       
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        int[] result = maxSlidingWindow(nums, k);
        
                System.out.println("Sliding Window Maximum: " + Arrays.toString(result));
            }
        public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        int ans[] = new int[nums.length - k + 1];
        int a = 0;

        for (int i = 0; i < k; i++) {
            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.removeLast();
            }
            q.addLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            ans[a++] = nums[q.peek()];

            while (!q.isEmpty() && q.peek() <= i - k) {
                q.removeFirst();
            }

            while (!q.isEmpty() && nums[i] >= nums[q.peekLast()]) {
                q.removeLast();
            }

            q.addLast(i);
        }

        ans[a++] = nums[q.peek()];
        return ans;
    }
}