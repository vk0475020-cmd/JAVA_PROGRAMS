class Solution {
    public int missingMultiple(int[] nums, int k) {
        int i=k;
        while(true){
            boolean found=false;
            for(int x:nums){
                if(x==i){
                    found=true;
                    break;
                }
            }if(!found){
                return i;
            }i+=k;
        }

    }
}