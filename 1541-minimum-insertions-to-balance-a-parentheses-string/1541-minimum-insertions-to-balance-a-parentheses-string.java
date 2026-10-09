class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int result = 0;//incertion

        int c = 0;
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == '(') {
                c++;
                i++;
            } else {
                if (c > 0) {
                    c--;
                } else {
                    result++;   //"("
                }
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    result++;  //")"
                    i++;
                }
            }
        }
        return result + c * 2; //if any '(' open bracket is left so add 2 ')'
    }
}