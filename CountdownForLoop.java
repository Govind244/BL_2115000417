import java.util.*;
class CountdownForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countdown start number: ");
        int countdown = sc.nextInt();

        if (countdown <= 0) {
            System.out.println("Please enter a positive number greater than 0");
        } else {
            System.out.println("Starting the countdown!");
            for (int i = countdown; i > 0; i--) {
                System.out.println(i);
            }
            System.out.println("Stop...");
        }

    }
}
