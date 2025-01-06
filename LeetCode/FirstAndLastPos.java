package LeetCode;

public class FirstAndLastPos {

    public static int[] findFirstAndLastPosition(int[] arr, int target){
        // Given an array of integers nums sorted in non-decreasing order,
        // find the starting and ending position of a given target value.

        //  If target is not found in the array, return [-1, -1].

        // Initialise a array
        // O(n) time complexity taken through this way
        // O(n) time complexity taken through this way


        // int[] result = new int[2];
        // result[0] = -1;
        // result[1] = -1;
        // int count =0;

        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i] == target && count == 0){
        //         count++;
        //         result[0] = i;
        //     }
        //     if(arr[i] == target && count >=1){
        //         count++;
        //         result[1] = i;
        //     }
        // }
        // return result;



        // // Through O(logn) Time Complexity

        // int startLen = 1; 
        // int endLen = arr.length;
        // boolean isVisited  = false;
        // int firstVisited = -1, lastVisited = -1;
        

        // int[] result = new int[2];
        // result[0] = -1;
        // result[1] = -1;

        // while(startLen < endLen){
        //     int mid = startLen + (endLen - startLen)/2;
        //     // {5,7,7,8,8,10}

        //     if(arr[mid] == target && isVisited == false){
        //         result[0] = mid;
        //         isVisited = true;
        //         firstVisited = mid;
        //         startLen = mid;
              
        //     }
        //     else if(arr[mid] == target && mid != firstVisited   && isVisited == true){
        //         result[1] = mid;
        //         lastVisited = mid;
        //         startLen = mid;
        //     }

        //     else if(arr[mid] < target){
        //         startLen = mid +1;
        //     }
        //     else{

        //         endLen = mid-1;
        //     }
        // }

        // result[0] = firstVisited;
        // result[1] = lastVisited;
        // System.out.println(result[0] + ","+ result[1]);
        // return result;



        // Effective way

        int result[] = {-1, -1};

        int Si = 0, Ei = arr.length-1;

        // Checking Length Condition

        if(arr.length == 0){
            return result;
        }
        if(arr.length == 1 && target == arr[0]){
            result[0] = 0;
            result[1] = 0;

            return result;
        }

        while (Si <= Ei) {
            int mid = Si + (Ei - Si)/2;

            if(arr[mid] == target){
                result[0] = mid;
                Ei = mid-1; // To Find Out the previous target element
            }

            else if(arr[mid] > target){
                Ei = mid -1;
            }
            else{
                Si = mid + 1;
            }
        }

        // Checking first element found or not

        if(result[0] == -1){
            return result;
        }

        // Now Finding the Last Occurance ot target

        Si = result[0];
        Ei = arr.length-1;

        while (Si <= Ei) {
            int mid = Si + (Ei - Si)/2;

            if(arr[mid] == target){
                result[1] = mid;
                Si = mid +1;
            }
            else if(arr[mid] < target){
                Si = mid + 1;
            }
            else{
                Ei = mid -1;
            }
        }

        if(result[1] == -1){
            result[1] = result[0];
            return result;
        }
        System.out.println(result[0] + " , "+result[1]);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1};

        int res[] = new int[2];


        res = findFirstAndLastPosition(arr, 1);

        for(int r : res){
            System.out.print(r + " ");
        }
    }
    
}
