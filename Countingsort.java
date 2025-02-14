import java.util.Arrays;

public class Countingsort {
    public static void countingSort(int[] ages) {
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages) {
            count[age - minAge]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int index = count[age - minAge] - 1;
            output[index] = age;
            count[age - minAge]--;
        }

        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 15, 11, 18, 10, 14, 16, 12, 17, 13, 11, 14};
        countingSort(studentAges);
        System.out.println(Arrays.toString(studentAges));
    }
}