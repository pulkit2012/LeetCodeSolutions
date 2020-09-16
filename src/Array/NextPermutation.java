package Array;


import java.util.Arrays;

public class NextPermutation {
    static void nextPermutation(int[] nums) {
        int p = 0;
        int Index = 0;
        boolean flag = false;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                flag = true;
                p = nums[i - 1];
                Index = i;
                break;
            }
        }
        if (!flag) {
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            return;
        }
        int q = 0;
        int qIndex = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > p) {
                q = nums[i];
                qIndex = i;
                break;
            }
        }
        nums[Index - 1] = q;
        nums[qIndex] = p;
        int pointer1 = Index;
        int pointer2 = nums.length - 1;
        int looper = (nums.length - Index) / 2;
        while (looper > 0) {
            int temp = nums[pointer1];
            nums[pointer1] = nums[pointer2];
            nums[pointer2] = temp;
            pointer1++;
            pointer2--;
            looper--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        nextPermutation(arr);
    }
}
