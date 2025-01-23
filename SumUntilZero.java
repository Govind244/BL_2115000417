import java.util.*;
class SumUntil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number: ");
            double userInput = sc.nextDouble();
            if (userInput == 0) {
                break;
            }
            total += userInput;
        }
        System.out.println("The total sum is: " + total);
    }
}
