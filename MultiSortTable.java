import java.util.*;
class MultiSortTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int Table[] = new int[10];
        for(int i=5; i<9; i++){
            Table[i]=number*(i+1);
            System.out.println(number + " * " + (i+1) + " = "+ Table[i]);
        }
    }
}
