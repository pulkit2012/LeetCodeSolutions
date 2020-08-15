package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SubarraySum {
    /* Brute Force...
    time complexity O(n^2)
    Space Complexity O(1)
     */
    static int[] twoSum(int[] arr, int target){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if(arr[i] + arr[i1] == target){
                    return new int[]{i , i1};
                }
            }
        }
        return new int[2];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        in.nextLine();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
