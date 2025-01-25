import java.util.Scanner;
class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");
            while (true) {
                System.out.print("Age: ");
                ages[i] = sc.nextInt();
                if (ages[i] > 0) break;
                System.out.println("Invalid age. enter valid age ");
            }
            while (true) {
                System.out.print("Height : ");
                heights[i] = sc.nextDouble();
                if (heights[i] > 0) break;
                System.out.println("Invalid height. enter again.");
            }
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is " + friends[youngestIndex] + " with an age of " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with a height of " + heights[tallestIndex] + " cm.");

    }
}
