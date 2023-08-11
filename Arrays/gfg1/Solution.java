import java.util.ArrayList;

public class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = 0;
        int cursum = 0;
        if (s == 0) {
            ans.add(-1);
            return ans;
        }

        while (end < n) {
            cursum = cursum + arr[end];

            while (cursum > s) {
                cursum = cursum - arr[start];
                start++;
            }

            if (cursum == s) {
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }
            end++;
        }
        ans.add(-1);
        return ans;
    }
}
