package LeetCode;

public class AverageSalary {
    public static double AverageSalary(int arr[]){
        int min=arr[0];
        int max =0;
        double sum = 0;

        for(int i=0; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max= arr[i];
            }

            sum = sum + arr[i];

        }
    

        return (sum - (min + max))/(arr.length-2);

        
    }

  
    
    public static void main(String[] args) {
        int[] arr = {100, 200, 300};

        System.out.println(AverageSalary(arr));
    }
}
