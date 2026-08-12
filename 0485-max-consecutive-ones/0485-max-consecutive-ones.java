class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int maxcount=0,count=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count >maxcount){   //if zero hai  i per
                    maxcount =count;
                }
            }
            else{
                count=0;
            }
         }return maxcount;
    }
}