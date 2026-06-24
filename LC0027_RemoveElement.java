class LC0027_RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
        {
            return 0;
        }
        if (nums.length == 1)
        {
            if (nums[0] == val) 
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        int i = 0, j = 0;
        while (j < nums.length)
        {
            if (nums[i] == val && nums[j] != val)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if (nums[i] == val && nums[j] == val)
            {
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
        return i;
    }
}