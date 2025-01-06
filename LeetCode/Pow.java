package LeetCode;

public class Pow {
    public static double Pow(double x, int n){

        // Simple way of recursion

        // if(x == 0 || n == 0){
        //     return 1;
        // }
        // double pow_nm1 = Pow(x, n-1);
        // double pow_n = x* pow_nm1;
        // return pow_n;


        // Best Way through Recursion

        if(n == 0  || x == 0){
            return 1;
        }
        if(n < 0){
            x = 1/x;
            n = -n;
        }

        double half = Pow(x, n/2);

        if(n % 2 == 0){
            return half * half;
        }
        else{
            return half * half * x;
        }



    }
    public static void main(String[] args) {
        double result = Pow(-2.0, 14);

        System.out.println(result);
    }
}
