import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double first = sc.nextDouble();
        System.out.println("Enter Second Number: ");
        double second = sc.nextDouble();
        System.out.println("Enter Operation to Perform: ");
        String op =sc.next();
        
        for(int i=1;i<2;i++){
            switch(op){
                case "+": 
                    System.out.println("The answer is "+(first+second));
                    break;
                case "-": 
                    System.out.println("The answer is "+(first-second));
                    break;
                case "*": 
                    System.out.println("The answer is "+(first*second));
                    break;
                case "/": 
                    System.out.println("The answer is "+(first/second));
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        }
    }
}