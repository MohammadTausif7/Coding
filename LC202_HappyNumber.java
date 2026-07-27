import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> vistd = new HashSet<>();
        while (n != 1 && !vistd.contains(n))
        {
            vistd.add(n);
            n = getnext(n);
        }

        return n == 1;
    }

    private int getnext(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            int dig = n % 10;
            sum += dig * dig;
            n /= 10;
        }

        return sum;
    }
}