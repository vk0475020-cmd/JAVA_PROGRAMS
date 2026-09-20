class Solution {
    public int reverseDegree(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int alpha = ch - 'a' + 1;
            int reverse = 27 - alpha;
            int position = i + 1;

            int prod = reverse * position;
            ans += prod;
        }

        return ans;
    }
}