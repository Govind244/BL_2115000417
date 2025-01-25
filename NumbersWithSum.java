import java.util.Scanner;
class NumbersWithSum {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number : ");
            double input = sc.nextDouble();
            if (input <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array is full! Stop input.");
                break;
            }
            numbers[index] = input;
            index++;
        }
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total of all numbers: " + total);
    }
}
