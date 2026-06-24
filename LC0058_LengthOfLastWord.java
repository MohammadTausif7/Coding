class LC0058_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s.isEmpty())
        {
            return 0;
        }
        if (!s.contains(" "))
        {
            return s.length();
        }
        int i = s.length() - 1;
        int wordlength = 0;
        while (i >= 0 && s.charAt(i) == ' ')
        {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ')
        {
            wordlength++;
            i--;
        }
        return wordlength;
    }
}