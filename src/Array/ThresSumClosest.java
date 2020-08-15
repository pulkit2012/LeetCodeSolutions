package Array;

import java.util.Arrays;

public class ThresSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum > target) {
                    high--;
                } else {
                    low++;
                }
                if (Math.abs(result - target) > Math.abs(sum - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        ThresSumClosest obj = new ThresSumClosest();
        System.out.println(obj.threeSumClosest(arr, 1));
    }
}
