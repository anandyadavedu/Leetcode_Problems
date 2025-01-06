package LeetCode;

public class PrimeCount {

    // Count Prime Number who are less than or equals to num

    public static int countPrime(int num) {

        if (num == 1 || num == 0) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }

        int pCount = 1;
        for (int i = 3; i <= num; i += 2) {
            int count = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                pCount++;
                System.out.print(i + " ");

            }


        }
        System.out.println();
        return pCount;

    }

    

    public static void main(String[] args) {
        System.out.println(countPrime(3));
    }
}
