package BinarySearch.leetCodeProblem704;

class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;

            if (nums[middle] == target)
                return middle;
            else if (nums[middle] > target)
                high = middle - 1;
            else if (nums[middle] < target)
                low = middle + 1;
        }
        return -1;
    }
}
