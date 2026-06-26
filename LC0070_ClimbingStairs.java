class LC0070_ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2)
        {
            return n;
        }
        int mem1 = 1;
        int mem2 = 2;
        int curr = 0;
        for (int i = 3; i <= n; i++)
        {
            curr = mem1 + mem2;
            mem1 = mem2;
            mem2 = curr;
        }
        return curr;
    }
}