package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> PascalTraingle(int num){
        List<List<Integer>> trinagle = new ArrayList<>();
       
        if(num >= 1){ // For all greater than 1 or equals to 1 
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            trinagle.add(firstRow);
        }


            List<Integer> prev = new ArrayList<>();
            prev.add(1);

            for(int i = 1; i < num; i++){
                 List<Integer> current = new ArrayList<>();
                 
                 // Add 1 for first element in each row
                 current.add(1);

                 // To add middle element 
                 for(int j = 1; j < i; j++){
                    current.add(prev.get(j-1) + prev.get(j));

                 }

                 // for last element
                 current.add(1);
                 trinagle.add(current); // add the element to main arraylist


                 prev = current;
            }
            return trinagle;
        
    }
    public static void main(String[] args) {
       List<List<Integer>> list = PascalTraingle(2);

       for(List<Integer> result : list){
        System.out.print(result);
       }
    }
}
