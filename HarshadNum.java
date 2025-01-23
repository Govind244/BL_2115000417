import java.util.Scanner;
public class HarshadNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int sum = 0; 
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (number % sum == 0) {
            System.out.println("Number is a Harshad Number");
        } else {
            System.out.println("Number is not a Harshad Number");
        }
    }
}
