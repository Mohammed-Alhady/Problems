public class Solution {
    public static boolean isPalindrome(int x) {
        int holder = 0, temp = x;

        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        while (x > 0) {
            int mod = x % 10;
            holder = holder * 10 + mod;
            x /= 10;
        }

        if (holder == temp) {
            return true;
        } else {
            return false;
        }
    }
}
