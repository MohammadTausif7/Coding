class LC0066_PlusOne {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        if (digits[i] != 9)
        {
            digits[i] += 1;
            return digits;
        }
        while (i >= 0 && digits[i] == 9)
        {
            digits[i] = 0;
            i--;
        }
        if (i == -1)
        {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        else
        {
            digits[i] += 1;
        }
        return digits;
    }
}