package LeetCode;

public class isMonotonic {
    public static boolean isMonotonicArray(int[] arr) {

        if (arr.length == 1 || arr.length == 2) {
            return true;
        }

        if (arr[1] - arr[0] > 0) {

            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i + 1] < arr[i]) {
                    return false;
                }
            }
        } else if (arr[1] - arr[0] < 0) {
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i + 1] > arr[i]) {
                    return false;

                }
            }
        } else {
            if (arr[2] - arr[1] > 0) {
                for (int i = 0; i < arr.length - 1; i++) {

                    if (arr[i + 1] < arr[i]) {
                        return false;
                    }
                }

            } else {
                for (int i = 0; i < arr.length - 1; i++) {

                    if (arr[i + 1] > arr[i]) {
                        return false;

                    }
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 5, 3, 5 };

        System.out.println(isMonotonicArray(arr));
    }
}
