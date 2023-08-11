import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for (int i = 0; i < nums.length - 1; i++){
        // for (int j = i + 1; j < nums.length; j++){
        // if (nums[i] == nums[j]) {
        // return true;
        // }
        // }
        // }
        // return false;

        // Arrays.sort(nums);
        // for (int j = 1; j < nums.length; j++){
        // if (nums[j] == nums[j-1]) {
        // return true;
        // }
        // }
        // return false;

        Set<Integer> a = new HashSet<Integer>();

        for (int i : nums) {
            a.add(i);
        }

        return (a.size() != nums.length);
    }
}
