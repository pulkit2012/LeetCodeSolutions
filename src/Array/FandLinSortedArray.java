package Array;

import java.util.Arrays;

public class FandLinSortedArray {
    static int[] searchRange(int[] nums, int check) {
        int[] result = new int[2];
        result[0] = getstarting(nums, check);
        result[1] = getEnding(nums, check);
        return result;
    }

    static int getstarting(int[] arr, int target) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if (arr[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    static int getEnding(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
            if(arr[mid] == target){
                index = mid;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(arr, 6)));
    }
}