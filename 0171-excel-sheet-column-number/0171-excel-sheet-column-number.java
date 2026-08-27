class Solution {
    public int titleToNumber(String columnTitle) {
        int s=0,p=0;
        int l=columnTitle.length();
        for(int i=l-1;i>=0;i--){
            int temp=columnTitle.charAt(i)-64;
            s=s+(int)Math.pow(26,p++)*temp; //Math funtion give's double so be have to convert it
        }
        return s;
        //AB =>1*26^1 + 2*26^0 =>26+2=>28 something like binary to int convergen 
        // 26 ? =>alphabet(a-z) count
        //ASCII code => A->64
    }
}