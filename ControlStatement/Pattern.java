public class Pattern {

    public static void SolidSquare(int row, int col){
        // for outer loop
        for (int i = 0; i < row; i++) {

            // for inner loop
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
                
            }
            // For Change line
            System.out.println(); 
            
        }
    }


    public static void HollowSquare(int row, int col){

        for(int i=1; i<=row; i++){

            for(int j=1; j<=col; j++){
                if((i==1) || (i==row) || (j==1) || (j==col)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
    

    public static void Right_Half_Pyramid(int row, int col){
        
        // For Row in pyramid
        for(int i=1; i<=row; i++){

            // For print
            for(int j=1; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();


        }
    }

    public static void Reverse_Right_Pyramid(int row, int col){

        for(int i=1; i<= row; i++){
            for (int j =row - i; j >=0; j--) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }

    public static void Left_Half_Pyramid(int row, int col){

        // For Total row in triangle
        for(int i=1; i<=row; i++){

            // For Space 
            for(int j=1; j<=row-i; j++){
                System.out.print("  ");
            }

            // For Print Astrick
            for(int k=0; k<i; k++){
                System.out.print("* ");
            }
            // For change line
            System.out.println();
        }
    }

    public static void Traingle_Star(int row, int col){

        for(int i=1; i<=row; i++){

            for(int j=1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void Hollow_Trangle_Star(int row, int col){

        for(int i=1; i <= row; i++){

            for(int j=1; j <=row-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k <= (2*i-1); k++){
                if(k==1 ||  i == row || k==(2*i-1) ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            

        }
    }

  public static void Number_Inc_Pyramid(int row){
    //  For Print this pattern 
    //  1
    //  1 2
    //  1 2 3

    for(int i=1; i<=row; i++){
        for(int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   
  }

  public static void Number_Changing_Pyramid(int row){
    // Print this pattern 
    //  1
    //  2 3
    //  4 5 6
    int count =0;
    for(int i=1; i<= row; i++){
        for(int j=1; j<=i;j++){
            System.out.print(++count + " ");
            // if we take count as 1 then i choose postfix like a++ instead of ++a
        }
        System.out.println();
    }
    
  }


   public static void Zero_One_Tringle(int row){
       // Print this pattern 
    //  1
    //  0 1
    //  1 0 1

    for(int i=1; i<=row; i++){
        for(int j=1; j<=i; j++){
            if((i + j) %2 == 0){
                System.out.print(1 + " ");
            }else
            System.out.print(0+ " ");
        }
        System.out.println();
    }

   }

   public static void Pascal_triangle(int row){

    for(int i=1; i<=row; i++){
        for(int j=1; j<= row-i; j++){
            System.out.print(" ");
        }

        int count = 1;

        for(int k=1; k<= i; k++){
            System.out.print(count + " ");
            count = count *(i-k)/k;
        }
        System.out.println();
    }
   }
    
   
   
   
   public static void main(String[] args) {

       // Solid Square 
        System.out.println("Solid Square Pattern");
        System.out.println();
        SolidSquare(5, 5);

        System.out.println();
       System.out.println("Hollow Pattern");
       HollowSquare(5, 5);

       System.out.println();
       System.out.println("Right Half Pyramid Traingle");
       Right_Half_Pyramid(5, 5);

       System.out.println();
       System.out.println("Revese Right Traingle");
       Reverse_Right_Pyramid(5, 5);

       System.out.println();
       System.out.println("Left Half Pyramid");
       Left_Half_Pyramid(5, 5);

       System.out.println();
       System.out.println("Traingle Star Pattern");
       Traingle_Star(5, 5);

       System.out.println();
       System.out.println("Hollow Traingle Pattern");
       Hollow_Trangle_Star(5, 5);

       System.out.println();
       System.out.println("Number Increment Pyramid");
       Number_Inc_Pyramid(5);

       System.out.println();
       System.out.println("Number Changing Pyramid");
       Number_Changing_Pyramid(5);

       System.out.println();
       System.out.println("Zero One Triangle");
       Zero_One_Tringle(5);

       
       System.out.println();
       System.out.println("Pascal's Triangle");
       Pascal_triangle(5);

    }


}
