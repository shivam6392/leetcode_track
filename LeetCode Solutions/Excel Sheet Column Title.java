class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sh = new StringBuilder();
        while(columnNumber> 0){
            columnNumber--;
            int rem = columnNumber% 26;
            sh.append((char)('A'+ rem));
            columnNumber = columnNumber/26;
        }
        return sh.reverse().toString();
    }
}