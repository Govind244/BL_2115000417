import java.util.*;
class IsLargest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number1: ");
    int number1=sc.nextInt();
    System.out.println("Enter number2: ");
    int number2=sc.nextInt();
    System.out.println("Enter number3: ");
    int number3=sc.nextInt();
    
    if(number1>number2){
        if(number1>number3){
            System.out.println("Is the first number the largest? Yes");
            System.out.println("Is the Second number the largest? No");
            System.out.println("Is the Third number the largest? No");
        }else{
            if(number3>number1){
                System.out.println("Is the first number the largest? No");
                System.out.println("Is the Second number the largest? No");
                System.out.println("Is the Third number the largest? Yes");
            }
        }
    }
    else{
        if(number2>number3){
        System.out.println("Is the first number the largest? No");
        System.out.println("Is the Second number the largest? Yes");
        System.out.println("Is the Third number the largest? No");
        }else{
            System.out.println("Is the first number the largest? No");
            System.out.println("Is the Second number the largest? No");
            System.out.println("Is the Third number the largest? Yes");
        }
    }
    }
}
