package Array;

import java.util.Scanner;

public class SearchInRotatedSortedArray {
    static int search(int[] arr, int check) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        while (leftPointer <= rightPointer) {
            int mid = (leftPointer + rightPointer) / 2;
            if (arr[mid] == check) {
                return mid;
            }
            if (arr[mid] >= arr[leftPointer]) {
                if (check > arr[mid]) {
                    leftPointer = mid + 1;
                } else if (check < arr[leftPointer]) {
                    leftPointer = mid + 1;
                } else {
                    rightPointer = mid - 1;
                }
            } else {
                if (check < arr[mid]) {
                    rightPointer = mid - 1;
                } else if (check > arr[rightPointer]) {
                    rightPointer = mid - 1;
                } else {
                    leftPointer = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
    }
}
