package LeetCode;

public class SqrtWithoutPowFn {
    public static int Sqrt(int num){

        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }

        int i = 1;
        int sq = i * i;

        while (num >= sq) {
            i++;
            sq = i * i;
        }
        return  (int)(i - 1);
    }
    public static void main(String[] args) {
        int num = 9;
        System.out.println(Sqrt(num));
    }
}
