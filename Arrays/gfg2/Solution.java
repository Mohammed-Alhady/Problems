package gfg2;

class Solution {
    int missingNumber(int array[], int n) {
        int sum = (n * (2 * 1 + (n - 1) * 1)) / 2;
        int missing = 0;

        for (int i = 0; i < array.length; i++) {
            missing += array[i];
        }
        return sum - missing;
    }
}
