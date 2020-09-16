package Array;

import javax.security.sasl.SaslClient;
import java.util.*;

public class FourSum {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> arr1 = new LinkedList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int i1 = i + 1; i1 < nums.length - 2; i1++) {
                    if (i1 == i + 1 || nums[i1] != nums[i1 - 1]) {
                        int low = i1 + 1;
                        int high = nums.length - 1;
                        int sum = target - nums[i] - nums[i1];
                        while (low < high) {
                            if (nums[low] + nums[high] == sum) {
                                arr1.add(Arrays.asList(nums[i], nums[i1], nums[low], nums[high]));
                                while (low < high && nums[low] == nums[low + 1]) {
                                    low++;
                                }
                                while (low < high && nums[high] == nums[high - 1]) {
                                    high--;
                                }
                                low++;
                                high--;
                            } else if (nums[low] + nums[high] > sum) {
                                high--;
                            } else {
                                low++;
                            }
                        }
                    }
                }
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(fourSum(arr, -1));
    }
}
