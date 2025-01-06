package ArraysProgram;

import java.util.Scanner;

public class SumOfDiagonal {

    public static void DiagonalSum(int[][] arr, int row){
        int PrincipalDiagonal = 0;
        int secondary_diagonal = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                if(i==j){
                    PrincipalDiagonal += arr[i][j];
                }
                if(i+j == row-1){
                    secondary_diagonal += arr[i][j];

                }
            }
        }
        System.out.println("Sum of Prinipal Diagonal is : "+ PrincipalDiagonal);
        System.out.println("Sum of Secondary Diagonal is : "+ secondary_diagonal);
        System.out.println("Sum of Total Diagonal is : "+ PrincipalDiagonal + secondary_diagonal);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix row number");
        int row= sc.nextInt();


        System.out.println("Enter the Element of Identity Matrix");
        int  arr[][] = new int[row][row];


        for(int i=0;i<row; i++){
            for(int j=0; j<row; j++){

                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("Identity matrix is: ");
        for(int i = 0; i < row; i++){
            
            for(int j = 0; j < row; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();

        DiagonalSum(arr, row);
        
    }
}
