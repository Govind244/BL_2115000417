import java.util.Scanner;
public class FactorialCalculatorByWhileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers. Please enter a positive integer.");
        } else {
            int factorial = 1;
            int i = 1;

            while (i <= n) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + n + " is: " + factorial);
        }

    }
}
