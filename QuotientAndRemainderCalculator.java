import java.util.*;
public class QuotientAndRemainderCalculator {

    public static int[] calculateQuotientAndRemainder(int number, int divisor) {
        int[] result = new int[2];

        result[0] = number / divisor;
        result[1] = number % divisor;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int[] result = calculateQuotientAndRemainder(number, divisor);

            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }
    }
}
