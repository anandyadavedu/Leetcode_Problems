package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class GoodString {
    // A string s is good if all the characters that appear in s 
    // have the same number of occurrences (i.e., the same frequency).

    public static boolean isGoodString(String s){

       if (s.length() == 1)
            return true;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int freq = map.get(s.charAt(0));
        for (char key : map.keySet()) {
            if (map.get(key) != freq)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "abcbac";

        System.out.println(isGoodString(s));
    }
}
