import java.util.HashMap;

class LC0169_MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int i = 0;

        while (i < nums.length)
        {
            if (!hm.containsKey(nums[i]))
            {
                hm.put(nums[i], 1);
            }
            else
            {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }

            if (hm.get(nums[i]) > nums.length / 2)
            {
                return nums[i];
            }

            i++;
        }
        return -1;
    }
}