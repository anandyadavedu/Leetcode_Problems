package ArraysProgram;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Matrix row number");
        int p = sc.nextInt();

        System.out.println("Enter First matrix colomn number");
        int q = sc.nextInt();

        int arr1[][]= new int[p][q];


        System.out.println("Enter the Row of Second Matrix");
        int m = sc.nextInt();

        System.out.println("Enter the colomn of second matrix");
        int n = sc.nextInt();

        int brr[][] = new int[m][n];


        if(!(p == m && q == n)){
            System.out.println("Invalid Matrix");

        }else{
            System.out.println("Enter the Element of first matrix");
            for(int i =0; i<p; i++){
                for(int j=0; j<q;j++){
                    arr1[i][j]= sc.nextInt();

                }
                System.out.println();
            }
            System.out.println("Enter the Element of second matrix");
            for(int i =0; i<p; i++){
                for(int j=0; j<q;j++){
                    brr[i][j]= sc.nextInt();

                }
                System.out.println();
            }

            System.out.println("First Array");
            for(int i=0; i<p; i++){
                for(int j=0; j<q; j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("Second matrix:");
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    System.out.print(brr[i][j]+" ");
                }
                System.out.println();
            }

            int crr[][]= new int[m][n];

            for(int i=0; i<m;i++){
                for(int j=0; j<n;j++){
                    crr[i][j] = arr1[i][j] + brr[i][j];
                }
                System.out.println();
            }

 
            //Print the addition matrix.
            System.out.println("Print the added matrix");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(crr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

}
