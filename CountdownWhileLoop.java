import java.util.*;
class CountdownWhileLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown start number: ");
        int countdown = sc.nextInt();

        if (countdown <= 0) {
            System.out.println("Please enter a positive number greater than 0");
        } else {
            System.out.println("Starting the countdown!");
            while (countdown > 0) {
                System.out.println(countdown);
                countdown--;
            }
            System.out.println("Stop...");
        }

    }
}
