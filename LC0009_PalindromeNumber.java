class LC0009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
        {
            return false;
        }
        else if (x == 0)
        {
            return true;
        }
        else
        {
            int num = 0;
            int xtemp = x;
            while (xtemp > 0) {
                num = num * 10;
                num = num + (xtemp % 10);
                xtemp = xtemp / 10;
            }
            return num == x;
        }
    }
}