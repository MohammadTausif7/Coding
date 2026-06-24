class LC0028_FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int i = 0, j = needle.length();
        int index = -1;
        while (j <= haystack.length())
        {
            if (haystack.substring(i, j).equals(needle))
            {
                index = i;
                break;
            }
            else
            {
                i++;
                j++;
            }
        }
        return index;
    }
}