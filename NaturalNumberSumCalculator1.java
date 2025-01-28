import java.util.*;
public class NaturalNumberSumCalculator {

    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            return;
        }

        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Sum of first " + n + " natural numbers (recursive): " + recursiveResult);
        System.out.println("Sum of first " + n + " natural numbers (formula): " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Both methods give the same result, the sum is correct.");
        } else {
            System.out.println("There is an error in the computation.");
        }
    }
}
