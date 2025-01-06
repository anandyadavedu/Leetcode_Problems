package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle2 {

    // RETURN THE EXACT ROW OF GIVEN PASCAL TRIANGLE

    public static List<Integer> returnExactTriangle(int rowIndex){

        List<Integer> result = new ArrayList<>();

        result.add(1);

        int temp = 1;

        for(int i = 1, up = rowIndex, down = 1; i <= rowIndex; i++, up--, down++){
            temp = temp * up / down;
            result.add((int) temp);
        }
        return result;






        // Another Way

        // List<Integer> curr = new ArrayList<>();

        // List<Integer> prev = new ArrayList<>();
        // int count = 0;

        // if(rowIndex == 0){
        //     curr.add(1);
        //     return curr;
        // }


        // if(rowIndex >= 1){
        //     curr.add(1);
        //     count++;
        // }

        // prev.add(1);
        // for (int i = 1; i < rowIndex; i++) {
        //     curr.add(1);
        //     for(int j = 1; j < i; j++){
        //         prev.add(curr.get(j-1) + curr.get(j));
        //     }
        //     curr.add(1);
        //     count++;
        // }
        // if(count == rowIndex){
        //    return curr;
        // }
       
        
    }
    public static void main(String[] args) {
        
        List<Integer> result = returnExactTriangle(1);

        for(int r: result){
            System.out.print(r+ " ");
        }
    }
}
