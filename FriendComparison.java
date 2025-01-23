import java.util.*;
public class FriendComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.println("Enter the age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.println("Enter the age of Anthony: ");
        int ageAnthony = scanner.nextInt();

        System.out.println("Enter the height of Amar in cm: ");
        int heightAmar = scanner.nextInt();
        System.out.println("Enter the height of Akbar in cm: ");
        int heightAkbar = scanner.nextInt();
        System.out.println("Enter the height of Anthony in cm: ");
        int heightAnthony = scanner.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
        
    }
}
