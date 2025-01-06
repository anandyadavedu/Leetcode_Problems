package LeetCode;

public class ReturnToOrigin {
    

    public static Boolean judgeCircle(String move){
        // Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
        // Return true if the robot returns to the origin after it finishes all of its moves, 
        // or false otherwise

        int up = 0,down =0, right =0, left = 0;

        char[] ch = move.toCharArray();
        for (char c : ch) {
            if(c == 'U'){
                up++;
            }else if(c == 'D'){
                down--;
            }
            else if(c == 'R'){
                right++;
            }else{
                left--;
            }
        }
        if(((up + down) == 0 && (right + left)== 0)){
            return true;
        }
        else{
            return false;
        } 

    }

    public static void main(String[] args) {
        String str = "RRDD";

        System.out.print(judgeCircle(str));
    }
}
