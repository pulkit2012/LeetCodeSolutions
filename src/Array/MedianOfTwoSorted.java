package Array;

public class MedianOfTwoSorted {
    static double medianGetter(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;
        int ans = 0;
        double prev = 0;
        int count = (arr1.length + arr2.length) / 2;
        if ((arr1.length + arr2.length) % 2 == 0) {
            for (int i1 = 0; i1 <= count; i1++) {
                prev = ans;
                if (i < arr1.length && j < arr2.length) {
                    ans = arr1[i] > arr2[j] ? arr2[j++] : arr1[i++];
                } else if (i < arr1.length) {
                    ans = arr1[i++];
                } else {
                    ans = arr2[j++];
                }
            }
            prev = (ans + prev) / 2;
            return prev;
        } else {
            for (int i1 = 0; i1 <= count; i1++) {
                if (i < arr1.length && j < arr2.length) {
                    ans = arr1[i] > arr2[j] ? arr2[j++] : arr1[i++];
                } else if (i < arr1.length) {
                    ans = arr1[i++];
                } else {
                    ans = arr2[j++];
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 8};
        int[] arr2 = {10, 12, 14, 16, 18, 20};
        System.out.println(medianGetter(arr1, arr2));
    }
}
