class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int c=0;
        while(xor>0){
            c+=xor&1;
            xor>>=1;
        }return c;
    }
}//1 ^ 0 or 0 ^ 1 = 1
//  if same 1^1 or 0^0=0
//  and same 1
//  next >>