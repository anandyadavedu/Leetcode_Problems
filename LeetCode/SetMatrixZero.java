package LeetCode;

public class SetMatrixZero {
    public static int[][] SetZeroe(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 0, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // System.out.println(SetZeroe(matrix).toString());
        int[][] result = SetZeroe(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {

                System.out.print(result[i][j] + " ");

            }
            System.out.println();

        }
    }
}
