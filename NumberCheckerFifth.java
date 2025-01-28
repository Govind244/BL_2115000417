import java.util.*;
public class NumberCheckerFifth{

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; // Second last factor is the greatest factor excluding the number itself
    }

    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1.0;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Exclude the number itself
            sum += factors[i];
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Exclude the number itself
            sum += factors[i];
        }
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int i = 0; i < factors.length - 1; i++) { // Exclude the number itself
            sum += factors[i];
        }
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28;

        System.out.println("Factors of " + number + ":");
        int[] factors = findFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(number));
        System.out.println("Product of Factors: " + productOfFactors(number));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(number));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        number = 145;
        System.out.println("\nTesting for " + number + ":");
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
