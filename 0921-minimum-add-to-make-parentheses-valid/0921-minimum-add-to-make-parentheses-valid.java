class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, sz = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                sz++;
            } 
            else if (sz > 0) {//if stack is empty
                sz--;
            } 
            else {
                open++;
            }
        }

        return open + sz;
    }
}