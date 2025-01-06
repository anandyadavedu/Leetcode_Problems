package ArraysProgram;

import java.util.Scanner;

public class LargestElement {
    public static int Largest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array length");
        int len = sc.nextInt();

        int arr[] = new int[len];

        System.out.println("Enter Array element");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println();
        System.out.println("Largest Number among the given array is : ");
        System.out.println(Largest(arr));

    }
}
