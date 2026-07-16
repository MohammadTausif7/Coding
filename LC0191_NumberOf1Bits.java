class LC0191_NumberOf1Bits {
    public int hammingWeight(int n) {
        int setbits = 0;
        while (n > 0) 
        {
            int curbit = 0;
            if ((curbit | (n & 1)) == 1)
            {
                setbits++;
            }
            n = n >>> 1;
        }
        
        return setbits;
    }
}