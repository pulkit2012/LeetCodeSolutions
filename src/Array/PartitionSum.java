package Array;

public class PartitionSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 3 != 0) {
            return false;
        } else {
            int check = sum / 3;
            int another = 0;
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                another += arr[i];
                if(another == check){
                    another = 0;
                    counter++;
                }
            }
            return counter >= 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(new PartitionSum().canThreePartsEqualSum(new int[]{0,2,1,-6,6,7,9,-1,2,0,1}));

    }
}
