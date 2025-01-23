import java.util.Scanner;
public class NaturalNumberSumWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
        } else {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int i = 1;

            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using the formula: " + formulaSum);
            System.out.println("Sum using the while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }

    }
}
