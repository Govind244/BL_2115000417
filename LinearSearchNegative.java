public class LinearSearchNegative {
    public static void main(String[] args) {
        int[] arr = {3, 8, -2, 7, 10};
        System.out.println(findFirstNegative(arr));
    }

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return i;
        }
        return -1;
    }
}