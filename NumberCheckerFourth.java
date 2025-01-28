public class NumberCheckerFourth {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + " is Prime: " + isPrime(number));
        System.out.println(number + " is Neon: " + isNeon(number));
        System.out.println(number + " is Spy: " + isSpy(number));
        System.out.println(number + " is Automorphic: " + isAutomorphic(number));
        System.out.println(number + " is Buzz: " + isBuzz(number));
        
        number = 7;
        System.out.println(number + " is Prime: " + isPrime(number));
        System.out.println(number + " is Neon: " + isNeon(number));
        System.out.println(number + " is Spy: " + isSpy(number));
        System.out.println(number + " is Automorphic: " + isAutomorphic(number));
        System.out.println(number + " is Buzz: " + isBuzz(number));
        
        number = 9;
        System.out.println(number + " is Prime: " + isPrime(number));
        System.out.println(number + " is Neon: " + isNeon(number));
        System.out.println(number + " is Spy: " + isSpy(number));
        System.out.println(number + " is Automorphic: " + isAutomorphic(number));
        System.out.println(number + " is Buzz: " + isBuzz(number));
    }
}
