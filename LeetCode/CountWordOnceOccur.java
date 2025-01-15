package LeetCode;

import java.util.HashMap;

public class CountWordOnceOccur {

    public static int countWord(String[] word1, String[] word2){
        // Given two string arrays words1 and words2, 
        // return the number of strings that appear exactly once in each of the two arrays.

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(String word: word1){
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        for(String word : word2){
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        int count = 0;
        for(String map : word1){
            if((map1.get(map) == 1) && (map2.getOrDefault(map, 0) == 1)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] word1 = {"leetcode","is","amazing","as","is"};
        String[] word2 = {"leetcode","is","amazing"};

        System.out.println(countWord(word1, word2));
    }
}
