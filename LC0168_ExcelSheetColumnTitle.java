class LC0168_ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder col = new StringBuilder();

        while (columnNumber > 0)
        {
            columnNumber--;
            int rem = columnNumber % 26;
            col.append(Character.toString('A' + rem));
            columnNumber /= 26;
        }

        return col.reverse().toString();
    }
}