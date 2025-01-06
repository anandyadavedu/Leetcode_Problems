package ArraysProgram;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {


    public static void Remove_duplicate(int[] arr){

        // print the arrays
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // First Way
        // Using Arrays 

        int newArr[] = Arrays.stream(arr).distinct().toArray();
        System.out.println("Unique Element is: "+ Arrays.toString(newArr));



        // Using HashSet

        Set<Integer> set = new HashSet<>();

        for(int Arr: arr){
            set.add(Arr);
        }

        System.out.println("After Remove duplicate element: " + set);




        // Without using any data structure

        // int brr[] = new int[arr.length];

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i] == arr[j]){
        //             brr[j]=1;
        //         }
        //     }
        // }
        // int count=0;

        // for(int k=0; k<brr.length; k++){
        //     if(brr[k] == 1){
        //         count++;
        //     }
        // }
        // int result[] = new int[count];
        // for (int i = 0; i < result.length; i++) {
        //     if(brr[i]!=1){
        //         result[i]= arr[i];

        //     }
        // }
        // System.out.println(count);

        // for (int i = 0; i < result.length; i++) {
        //     System.out.print(result[i]+" " );
        // }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Enter the Length of Array");
        int len= sc.nextInt();


        int arr[] = new int[len];
        System.out.println("enter the element of the arrays:");
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        Remove_duplicate(arr);
       
    }
}
