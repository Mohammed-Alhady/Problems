class Solution:
    def search(self, nums, target: int) -> int:
        if (len(nums) == 0):
            return 1

        low = 0
        high = len(nums) - 1
        while (low <= high):
            middle = int((low + high) / 2)

            if (nums[middle] == target):
                return middle
            elif (nums[middle] > target):
                high = middle - 1
            elif (nums[middle] < target):
                low = middle + 1
        return -1
