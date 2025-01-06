package LeetCode;

public class complement {
    public  static int findComplement(int n){
        return ~n;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
