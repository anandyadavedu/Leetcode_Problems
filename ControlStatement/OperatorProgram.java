import java.util.Scanner;

public class OperatorProgram {

    public static void BitwiseOR_AND_XOR_Comp(int a , int b){
        System.out.println(" Bitwise OR of "+a+" and "+b +" is :" + (a | b));
        System.out.println(" Bitwise AND of "+a+" and "+b +" is :" + (a & b));
        System.out.println(" Bitwise XOR of "+a+" and "+b +" is :" + (a ^ b));

        //  complementry of any number is 
        //  ~a = -(a+1) , like ~12= -13 
        System.out.println(" Bitwise Complement of "+a+" is :" + ~a);
    }

    // Here We can use AND to find out even odd number
    public static void EvenOdd(int num){
        if((1& num ) == 0){
           System.out.println(num + " is Even");
        }
        if((1 & num)==1){
            System.out.println(num + " is Odd");
        }
        
    }


    public static void ShiftOperator(int a, int b){

        //Left shift operator

      // a<<b = a*2^b
        System.out.println("Left Shift of a << b is : "+ (a<<b));
        System.out.println();

        // a>>b = a/2^b
        System.out.println("Right Shift of b >> a is : " +(b>>a));

    }
    public static void main(String[] args) {
        BitwiseOR_AND_XOR_Comp(22 ,13);


        System.out.println();
        EvenOdd(-12);
        ShiftOperator(2, 5);


    }
    
}
