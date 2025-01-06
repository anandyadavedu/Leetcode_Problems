package LeetCode;

public class isAnagram {
    public static boolean isAnagramOrNot(String s, String t){

        // Basic Implementation
        // Basic Implementation

        // int First_sum = 0;
        // int Second_sum = 0;
        // if(s.length() != t.length()){
        //     return false;
        // }

        // for(int i=0; i<s.length(); i++){

        //     First_sum  += (s.charAt(i) - 'a');
        //     Second_sum += t.charAt(i) - 'a';

        // }
        // if(First_sum == Second_sum){
        //     return true;
        // } 
        // return false;


        // Advance Implementation

        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i=0; i< s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;

        }

        for (int result : count) {
            if(result != 0){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        String s = "ac";
        String t = "bb";

        System.out.println(isAnagramOrNot(s, t));
    }
}
