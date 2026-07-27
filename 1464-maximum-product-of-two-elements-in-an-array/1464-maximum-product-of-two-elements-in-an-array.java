class Solution {
    public int maxProduct(int[] nums) {
        int max=0,max2=0;
        for(int i:nums){
            if(i>max){
                max2=max;
                max=i;
            }else if(i>max2)
                max2=i;
        }
        // Arrays.sort(nums);
        // int l=nums.length;
        // max=nums[l-2];
        // max2=nums[l-1];
        return (max-1)*(max2-1);

    }
}