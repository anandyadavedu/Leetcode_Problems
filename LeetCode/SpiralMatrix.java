package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralmatrix(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if (matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        AddElement(matrix, 0, 0, matrix.length, matrix[0].length, result);
        return result;

    }

    public static void AddElement(int[][] matrix, int rowStart, int colStart, int rowEnd, int colEnd,
            List<Integer> result) {

        if (rowStart >= rowEnd || colStart >= colEnd) {
            return;
        }

        // Traverse from left to right across top row

        for (int i = colStart; i < colEnd; i++) {
            result.add(matrix[rowStart][i]);
        }

        // Traverse from Top to bottom across right column

        for (int j = rowStart + 1; j < rowEnd; j++) {
            result.add(matrix[j][colEnd -1]);
        }

        // Traverse from right to left across bottom column

        if (rowStart < rowEnd - 1) {
            for (int k = colEnd - 2; k >= colStart; k--) {
                result.add(matrix[rowEnd -1][k]);
            }

        }

        // Traverse from bottom to top across the bottom row

        if (rowStart < rowEnd - 1) {

            for (int l = rowEnd - 2; l> rowStart; l--) {
                result.add(matrix[l][colStart]);
            }
        }

        AddElement(matrix, rowStart +1, colStart+1, rowEnd-1, colEnd-1, result);

    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<Integer> list =spiralmatrix(matrix);

        for (int num: list) {
            System.out.print(num + " ");
        }
    }
}
