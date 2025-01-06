package LeetCode;

public class FindDifference {

    public static char FindDifference(String s, String t){

        // For Simple Case
        // For Simple Case Start Here

        // char[] sh = s.toCharArray();
        // char[] th = t.toCharArray();

        // for(int i=0; i<s.length(); i++){
        //     if(sh[i] != th[i]){
        //         return th[i];
        //     }
        // }
        // return th[s.length()];

        //For Simple Case End Here

        // Using ASCII Value comparision Start 

                // char[] sh = s.toCharArray();
                // char[] th = t.toCharArray();

                // int Total_Sum_Sh=0;
                // int Total_Sum_Th =0;

                // for(int i =0; i<sh.length;i++){

                //     Total_Sum_Sh +=sh[i];

                // }
                // for(int j=0; j<th.length;j++){
                //     Total_Sum_Th += th[j];
                // }

                // return (char) (Total_Sum_Th - Total_Sum_Sh);
                
        // Using ASCII Value comparision End

        // Using XOR operator
        // Using XOR operator
        char result = 0;
        // XOR all characters in both strings
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return result;




    }
    public static void main(String[] args) {
        String s= "abcd";
        String t = "dbace";

        char result = FindDifference(s, t);
        System.out.println(result);
    }
}
