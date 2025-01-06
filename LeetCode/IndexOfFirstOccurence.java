package LeetCode;

public class IndexOfFirstOccurence {
    public static int FindFirstOccurIndex(String heyStack , String needle){

        // Anand Kumar Yadav

        for (int i = 0, j= needle.length(); j <= heyStack.length();  i++, j++) {
            if(heyStack.substring(i, j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String heystack = "Anand Kumar Yadav";
        String needle = "Yadav";

        System.out.println(FindFirstOccurIndex(heystack, needle));

    }
}
