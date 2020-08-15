package Array;

public class RemoveDuplicates {
    static int removeDuplicates(int[] nums) {
       int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != nums[i + 1]){
                nums[count++] = nums[i + 1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
