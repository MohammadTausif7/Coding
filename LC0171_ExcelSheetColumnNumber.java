class LC0171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        int deg = 0;
        
        for (int i = columnTitle.length() - 1; i >= 0; i--)
        {
            num += (columnTitle.charAt(i) - '@') * Math.pow(26, deg);
            deg++;
        }

        return num;
    }
}