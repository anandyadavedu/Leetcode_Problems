package LeetCode;

import java.util.Collection;

public class ReversePrefix {

    public static String reversePrefixString(String str, char ch){
        if(str.isEmpty()){
            return "";
        }

        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                rev = str.substring(0, i + 1);
                System.out.println(rev);
                break;
            }
        }

        if(rev.length() == 0){
            return str;
        }

        String s ="";

        for(int j = rev.length() - 1; j >= 0; j--){
            s += rev.charAt(j);
        }

        return s.concat(str.substring(rev.length()));
    }
    public static void main(String[] args) {
        String str ="abcdefg";
        char ch = 'd';

        System.out.println(reversePrefixString(str, ch));
    }
}
