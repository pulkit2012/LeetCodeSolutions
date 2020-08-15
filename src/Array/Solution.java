package Array;

import java.util.Random;

public class Solution {
    static void generateOTP(){
        int a = 0;
        Random random = new Random();
        a = random.nextInt(999999);
        String a1 = String.format("%06d",a);
        System.out.print("Your OTP is: ");
        for (int i = 0; i < a1.length(); i++) {
            System.out.print(a1.charAt(i) + ((i == a1.length() - 1) ? "" : "-"));
        }
    }
    public static void main(String[] args) {
        generateOTP();
    }
}
