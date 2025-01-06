package LeetCode;


public class MejorityElement {
    public static int majorityElement(int[] nums){
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int element : nums){
        //     if(map.containsValue(element)){
        //         map.put(map.get(element) + 1, element);
        //     }else{
        //         map.put(1, element);
        //     }

        // }
        
        // return map.containsKey(map);
 


        // Most Important technique to find out 
        // most occurence of an element in array,

        int element = -1;
        int count = 0;

        for(int el: nums){
            if(count == 0){
                element = el;
            }

            // If same element then count + 1 otherwise count - 1
            count += (el == element) ? 1 : -1;  
        }
        // finally only that element occurs who have most majority
        // and return that element
        return element;

    }
    public static void main(String[] args) {
        int[] nums = {1,3,3,3,4};

        System.out.println(majorityElement(nums));
    }
}
