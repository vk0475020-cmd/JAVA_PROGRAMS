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

            int len = j - i;// count the lenght of 1 and 0 

            if (s.charAt(i) == '1') {
                ones += len;
            } else {
                max = Math.max(max, prev + len);//ye one se phale ke  
                prev = len;                     //zero ke count ko 
                                                //store kar  
                                                //raha hai
            }

            i = j;
        }

        return ones + max;
    }
}