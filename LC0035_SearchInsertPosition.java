class LC0035_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
        {
            return 0;
        }
        if (nums.length == 1)
        {
            if (nums[0] < target)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int index = -1;
        if (nums[nums.length/2] <= target)
        {
            for (int i = nums.length/2; i < nums.length; i++)
            {
                if (nums[i] == target)
                {
                    index = i;
                    break;
                }
                else if (nums[i] < target)
                {
                    index = i + 1;
                }
                else
                {
                    index = i;
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < nums.length/2; i++)
            {
                if (nums[i] == target)
                {
                    index = i;
                    break;
                }
                else if (nums[i] < target)
                {
                    index = i + 1;
                }
                else
                {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}