
import java.util.*;
import java.util.Scanner;



public class BasicProgram {

    public static boolean PrimaNumber(int num) {
        int count = 0;

        if (num > 0) {
            for (int i = 2; i > num / 2; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
        } else {
            num = -num;
            for (int i = 2; i > num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }
        if (count == 0)
            return true;
        else
            return false;
    }


    public static int PrimeInRange(int low, int high){
        int p_count=0;
        while(low<high){
            int count =0;
            for (int i = 2; i <low/2 ; i++) {
                if(low%i == 0){
                    count++;
                }
            }
            if(count == 0){
                p_count++;
            }
            low++;
        }
        return p_count;
    }

    public static int ReverseNumer(int num){

        int temp= num;
        int rev=0, rem;

        if(temp>0){
            while(num>0){
                rem= num%10;
                rev= rev*10 + rem;
                num= num/10;
            }
            return rev;

        }else{
            num = -num;
            while(num>0){
                rem= num%10;
                rev= rev*10 + rem;
                num= num/10;
            }
            return -rev;
        }  

    }

    public static void IsPalindromeNumber(int num){
        int temp= num;
        int rem, rev=0;

        if(num<0){
            System.out.println("Number is not Palindrome");

        }
        while (num>0) {
            rem = num%10;
            rev = rev*10 +rem;
            num =num/10;
        }

        if(temp == rev){
            System.out.println("Number is Palindrome ");

        } 
        else
         System.out.println("Number is Not Palindrome");
    }
    

    public static void LeapYear(int year){
        if(year<0){
            System.out.println("Invalid year you have provide" );
        }

        if(year %4 ==0 || year%100 ==0){
            System.out.println(year +" is Leap Year");
        }else{
            System.out.println(year+ " is not a leap year");
        }
    }



    @SuppressWarnings("unchecked")
    public static void FabonacciNumber(int range){

        int a=-1, b=1;

        for(int i=1; i<=range; i++){
            int c = a+b;
            System.out.print(c+" ");

            a=b;
            b=c;
        }
    }

    public static void ArmstrongNumber(int number){

        if(number >= 0 && number < 10){
            System.out.println(number +" is Armstrong");
            return;
        }

        // Find Digit in number
        int digit = (int) (Math.log10(Math.abs(number)))+1;
        int sum= 0;
        int temp = number;

        while(number!=0){
            int rem = number%10;
            sum = sum + (int)(Math.pow(rem, digit));
            number = number/10;
        }
        if(temp == sum){
            System.out.println(temp+ " is Armstrong Number");
        }else{
            System.out.println(temp +" is NOT a Armstrong Number");

        }

        
    }

    public static void main(String args[]) {

        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // Call PrimaNumber Method
        System.out.println(num + " is Prime Number ");
        System.out.println(PrimaNumber(num));

        System.out.println("Prime number between the range");
        System.out.println(PrimeInRange(10, 20));


        System.out.println("Reverse the Number of "+ num);
        System.out.println(ReverseNumer(num));


        IsPalindromeNumber(num);

        System.out.println();
        LeapYear(num);

        System.out.println();
        System.out.println("Febonacci Number");
        FabonacciNumber(8);

        System.out.println();
        System.out.println("Armstrong Number");
        ArmstrongNumber(153);


    }
}