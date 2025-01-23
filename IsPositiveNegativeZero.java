import java.util.*;
class IsPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("positive");
        }else if(number < 0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}

