import java.util.Scanner;
class ArmstringNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int temp = number;
        int sum = 0;

        int digits = Integer.toString(number).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); 
            temp /= 10;
        }
        
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
