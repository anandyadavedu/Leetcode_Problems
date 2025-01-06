import java.util.Scanner;

public class NthPrimeNumber {

    public static int PrimeMover(int num){

        if(num < 1){
            throw new IllegalArgumentException("Number should be greater then 1");
        }
        int count = 0;
        int number = 1;

        while(count < num){
            number++;
            if(isPrime(number)){
                count++;
            }
        }
       return number;

    }

    public static Boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        int count = 0;

        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0){
                count++;
            }
        }
        if(count > 0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number of Nth prime number");

        Scanner sc = new Scanner(System.in);

       int num =  sc.nextInt();

    //   System.out.println(isPrime(num));

      System.out.println(PrimeMover(num));
    }
}
