package Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class SpiralMatrix {
    static int[][] matrixCreator(int l, int b) {
        int[][] matrix = new int[l][b];
        int counter = 0;
        for (int i = 0; i < l; i++) {
            for (int i1 = 0; i1 < b; i1++) {
                matrix[i][i1] = counter++;
            }
        }
        return matrix;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int dir = 0;
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top += 1;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right -= 1;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom -= 1;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left += 1;
            }
            dir = (dir + 1) % 4;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] mat = matrixCreator(3,3);
        for (int i = 0; i < mat.length; i++) {
            for (int i1 = 0; i1 < mat.length; i1++) {
                System.out.print(mat[i][i1] + " ");
            }
            System.out.println();
        }
        SpiralMatrix obj = new SpiralMatrix();
        System.out.println(obj.spiralOrder(mat));
    }
}
