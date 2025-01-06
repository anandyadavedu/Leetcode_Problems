package LeetCode;

public class EliminateMonster {

    public static int eliminatMonsterCount(int[] dist, int[] speed){
        int n = dist.length;
        if(n == 1){
            return 1;
        }
        int count = 1;

        for (int i = 1, j = 1; i < n && j < n; i++, j++) {
           for(int k = 1; k < n; k++){
            dist[i] = dist[i] - speed[k];

           }
           

            if(dist[i] <= 0){
                return count;
            }else{
                count++;
            }
            System.out.println(dist[i]);
        }
        return n;
    }
    public static void main(String[] args) {
        int[] dist = {4,2,8}, speed = {2,1,4};

       System.out.println(eliminatMonsterCount(dist, speed));
    }
}
