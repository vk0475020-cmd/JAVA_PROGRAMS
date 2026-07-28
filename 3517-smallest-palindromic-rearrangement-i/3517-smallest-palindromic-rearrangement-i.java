class Solution {
    public String smallestPalindrome(String s) {
        char chararr[] = s.toCharArray();
        int l=chararr.length;
        int mid=l/2;
        Arrays.sort(chararr,0,mid);
        for(int i=0;i<mid ;i++){
            chararr[l-1-i]=chararr[i];
        }
        return new String(chararr);
    }
}