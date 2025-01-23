import java.util.*;
public class DayOfWeekNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month: ");
        int m=sc.nextInt();
        System.out.println("Enter date: ");
        int d=sc.nextInt();
        System.out.println("Enter Year: ");
        int y=sc.nextInt();
        sc.close();

        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m) / 12) - 2;
        int day = (d + x +(31 * mo) / 12 ) % 7;
        
        System.out.println("So the day is "+day);
    }
}