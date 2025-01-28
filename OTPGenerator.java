import java.util.*;
public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOTPs.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }
        boolean unique = areOTPsUnique(otpArray);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are not unique.");
        }
    }
}
