import java.util.*;
class IsSpring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month : ");
        int month = sc.nextInt();
        if(month > 13){
            System.out.println("Invalid Month");
        }else{
        System.out.println("Enter the Day : ");
        int day = sc.nextInt();
        
        boolean isSpring = false;
        
        
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) ||  
            (month == 5 && day >= 1 && day <= 31) ||  
            (month == 6 && day >= 1 && day <= 20)) {  
            isSpring = true;
        }
        
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        }
    }
}
