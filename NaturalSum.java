import java.util.Scanner;
class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number1 = sc.nextInt();

        if (number1 > 0) {
            int sum = number1 * (number1 + 1) / 2; 
            System.out.println("The sum of " + number1 + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number1 + " is not a natural number");
        }

       
    }
}
