class PalindromeNumber {
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
            int xcopy = x;
            while (xcopy > 0) {
                num = num * 10;
                num = num + (xcopy % 10);
                xcopy = xcopy / 10;
            }
            return num == x;
        }
    }
}