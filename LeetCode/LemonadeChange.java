package LeetCode;

public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {

        if (bills[0] != 5) {
            return false;
        }
        int fiveDollorCount = 0;
        int tenDollorCount = 0;
        int twentyDollorCount = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i]/5 == 1 ) {
                fiveDollorCount++;
            }
            if (bills[i] / 5 == 2) {
                tenDollorCount++;
                if (fiveDollorCount > 0) {
                    fiveDollorCount --;
                } 
                else
                    return false;

            }
            System.out.print(tenDollorCount +"\n five dolor count"+ fiveDollorCount);
            if (bills[i] / 5 == 4) {
               
                twentyDollorCount++;
                if ((tenDollorCount > 0) && (fiveDollorCount > 0)) {
                    tenDollorCount--;
                    fiveDollorCount--;
                } else if (fiveDollorCount > 2) {
                    fiveDollorCount -= 3;
                } else {
                    return false;
                }

            }
        }
        return true;

    }
    public static void main(String[] args) {
        int bills[] = {5,5,10,20,20};

        System.out.println(lemonadeChange(bills));


    }
}
