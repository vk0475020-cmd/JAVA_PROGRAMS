class Solution {
    public int maxActiveSectionsAfterTrade(String s) {

        int ones = 0;
        int prev = Integer.MIN_VALUE;
        int max = 0;

        int i = 0;

        while (i < s.length()) {

            int j = i;

            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }

            int len = j - i;

            if (s.charAt(i) == '1') {
                ones += len;
            } else {
                max = Math.max(max, prev + len);
                prev = len;
            }

            i = j;
        }

        return ones + max;
    }
}