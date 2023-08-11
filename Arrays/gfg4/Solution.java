public class Solution {
    public static int equilibriumPoint(long arr[], int n) {

        if (n == 1) {
            return 1;
        }

        int left = 1, right = n - 2;
        Long sumLeft = arr[0], sumRight = arr[n - 1];

        while (left < right) {
            if (sumLeft + arr[left] > sumRight + arr[right]) {
                sumRight += arr[right];
                right--;
            } else {
                sumLeft += arr[left];
                left++;
            }
        }
        if (sumLeft == sumRight)
            return left + 1;
        return -1;
    }

    public static void main(String[] args) {

    }
}
