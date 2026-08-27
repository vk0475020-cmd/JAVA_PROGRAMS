class Solution {
    public int titleToNumber(String columnTitle) {
        int s=0,p=0;
        int l=columnTitle.length();
        for(int i=l-1;i>=0;i--){
            int temp=columnTitle.charAt(i)-64;
            s=s+(int)Math.pow(26,p++)*temp;

        }
        return s;
    }
}