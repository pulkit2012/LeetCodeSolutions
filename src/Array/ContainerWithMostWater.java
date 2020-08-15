package Array;

import java.util.Scanner;

public class ContainerWithMostWater {
    /*
    Brute Force Approach
     */
    static int maxContainer1(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int i1 = i + 1; i1 < arr.length; i1++) {
                if (Math.min(arr[i], arr[i1]) * (i1 - i) > ans) {
                    ans = Math.min(arr[i], arr[i1]) * (i1 - i);
                }
            }
        }
        return ans;
    }

    /*
    Efficient Approach
     */
    static int maxContainer2(int[] arr) {
        int i = 0;
        int i1 = arr.length - 1;
        int area = 0;
        while (i < i1) {
            area = Math.max(area, Math.min(arr[i], arr[i1]) * (i1 - i));
            if(arr[i] < arr[i1]){
                i += 1;
            }
            else {
                i1 -= 1;
            }

        }
        return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxContainer1(arr));
        System.out.println(maxContainer2(arr));
    }
}
