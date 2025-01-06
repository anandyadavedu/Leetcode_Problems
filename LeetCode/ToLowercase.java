package LeetCode;

public class ToLowercase {

    public static String ConvertToLowercase(String str){
        StringBuilder sb= new StringBuilder();

        // for(int i=0; i< str.length(); i++){
        //     if(str.charAt(i)<=90 && str.charAt(i)>=65){
        //         sb.append((char)(str.charAt(i)+32));

        //     }else{
        //         sb.append(str.charAt(i));
        //     }
           
        // }

        // Using ForEach Loop

        for(char ch: str.toCharArray()){

            if( ch >='A' && ch<= 'Z'){
                sb.append((char)(ch+32));
            }else{
                sb.append(ch);
            }

        }


        return sb.toString();
        
    }
    public static void main(String[] args) {
        String str= "Anand YADAV";

        System.out.println(ConvertToLowercase(str));
    }
}
