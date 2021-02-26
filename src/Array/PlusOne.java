package Array;

import java.util.Arrays;

public class PlusOne {
    static int[] plusOne(int[] digits) {
        int i;
        for(i = digits.length - 1; i >= 0; i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                }
                else {
                    digits[i] += 1;
                    break;
                }
            }
        if(i == -1){
            int[] arr = new int[digits.length + 1];
            arr[0] += 1;
            return arr;
        }
        else {
            return digits;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3})));
    }
}
