package Array;

public class RotateImage {
    static void rotate(int[][] arr) {
        transpose(arr);
        revert(arr);
    }
    static void transpose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                if(i1 > i){
                    int temp = arr[i1][i];
                    arr[i1][i] = arr[i][i1];
                    arr[i][i1] = temp;
                }
            }
        }
    }
    static void revert(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int reverser = arr.length-1;
            for (int i1 = 0; i1 < arr.length / 2; i1++) {
                int temp = arr[i][i1];
                arr[i][i1] = arr[i][i1 + reverser];
                arr[i][i1 + reverser] = temp;
                reverser -= 2;
            }
        }
    }
    static void printer(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.print(arr[i][i1] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int counter = 1;
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                arr[i][i1] = counter;
                counter++;
            }
        }
       rotate(arr);
        printer(arr);
    }
}
