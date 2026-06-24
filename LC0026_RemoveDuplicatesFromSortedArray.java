class LC0026_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
        {
            return nums.length;
        }
        
        int i = 0, j = 1;

        while (j < nums.length)
        {
            if (nums[i] == nums[j])
            {
                j++;
            }
            else
            {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        return i+1;
    }
}