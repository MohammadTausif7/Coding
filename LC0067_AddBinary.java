class LC0067_AddBinary {
    public String addBinary(String a, String b) {
        int k = Math.max(a.length(), b.length());
        int[] result = new int[k + 1];
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0)
        {
            int sum = carry;
            if (i >= 0)
            {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0)
            {
                sum += b.charAt(j) - '0';
                j--;
            }
            result[k] = sum % 2;
            carry = sum / 2;
            k--;
        }
        StringBuilder binarysum = new StringBuilder();
        for (int x = k + 1; x < result.length; x++)
        {
            binarysum.append(result[x]);
        }
        return String.valueOf(binarysum);
    }
}