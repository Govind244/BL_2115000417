import java.util.*;
public class ChocolateDistributionCalculator {

    public static int[] calculateChocolatesPerChild(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];

        result[0] = numberOfChocolates / numberOfChildren;
        result[1] = numberOfChocolates % numberOfChildren;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = calculateChocolatesPerChild(numberOfChocolates, numberOfChildren);

            System.out.println("Each child will get: " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
