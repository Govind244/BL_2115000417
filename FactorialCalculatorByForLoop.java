import java.util.Scanner;
public class FactorialCalculatorByForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please enter a positive integer.");
        } else {
            int factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + n + " is: " + factorial);
        }
    }
}
