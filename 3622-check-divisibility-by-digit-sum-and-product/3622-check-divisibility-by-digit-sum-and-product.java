class Solution {
    public boolean checkDivisibility(int n) {
        int p=1,s=0;
        int t=n;
        while(t!=0){
            s=s+t%10;
            p=p*(t%10);
            t/=10;
        }return n %(s+p)==0;
    }
}