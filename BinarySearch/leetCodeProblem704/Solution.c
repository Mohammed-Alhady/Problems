int search(int *nums, int numsSize, int target)
{
    int low = 0, high = numsSize - 1;
    while (low <= high)
    {
        int middle = (low + high) / 2;

        if (nums[middle] == target)
            return middle;
        else if (nums[middle] < target)
            low = middle + 1;
        else if (nums[middle] > target)
            high = middle - 1;
    }
    return -1;
}