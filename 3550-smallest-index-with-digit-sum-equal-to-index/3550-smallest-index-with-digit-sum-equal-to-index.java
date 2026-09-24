class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int no=nums[i];
            int sum=0;
            while(no>0){
                sum+=no%10;
                no/=10;
            }
            if(sum==i){
                return i;
            }
        }return -1;
    }
}