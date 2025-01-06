package LeetCode;

public class LengthOfLastWord {
    public static int LastWordlength(String str){
        String trim = str.trim();
        int n = trim.length();
        int count = 0;

        for(int i=n-1; i>=0; i--){

            if(trim.charAt(i) == ' '){
                return count;
            }else{
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {

        String s = " Yadav ddd ";

      System.out.println(LastWordlength(s));
        
    }
}
