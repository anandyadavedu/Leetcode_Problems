package LeetCode;

public class ThreeDivisor {

    public static Boolean IsthreeDivisor(int num){

        // Given an integer n,
        //  return true if n has exactly three positive divisors. Otherwise, return false.

        int count =0;
        if(num < 3){
            return false;
        }else{
            for(int i = 2; i <= num/2; i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 1){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(IsthreeDivisor(6));
    }
}
