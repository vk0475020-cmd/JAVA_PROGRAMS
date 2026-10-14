class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        int n=sum/9; //it give max no of 9
        int r=sum%9; //remender 
        for(int i=0;i<n;i++){
            sb.append(9);
        }
        if(r>0){
            sb.append(r);
        }
        while(sb.length()<num){
            sb.append(0);
        }return sb.toString();
    }
    
}