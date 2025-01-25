import java.util.Scanner;
class PlayersHeight{
    public static void main(String[] args) {
        double[] heights = new double[11];
        double total = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the heights of 11 players: ");

        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            total += heights[i];
        }
        double mean = total / 11;
        // System.out.printf("\nThe mean height of the football team is: %.2f cm\n", mean);
        System.out.println("The mean height of the football team is: "+ mean);

    }
}
