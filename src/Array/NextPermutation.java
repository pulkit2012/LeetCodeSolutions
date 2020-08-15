package Array;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NextPermutation {
    static void nextPermutation(int[] nums) {
        int index = 0;
        int val = 0;
        if(nums.length <= 1){
            return;
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i;
                val = nums[i - 1];
                break;
            }
        }
        int min = nums[index];
        for (int i = index + 1; i < nums.length; i++) {
           // if(){}
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
    }
}
class test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String regex = "\\s";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(a);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        for (int i = 1; i <= count; i++) {
            if(i % 2 == 0){
                a = a.replaceFirst(regex,"even");
            }
            else {
                a = a.replaceFirst(regex,"odd");
            }
        }
        System.out.println(a);
    }
}