class Solution {
    public int countDigits(int num) {
        int c=0;
        int x=num;
        while(num!=0){
            int t=num%10;
            if(x%t==0){
                c++;
            }num/=10;
        }return c;
    }
}