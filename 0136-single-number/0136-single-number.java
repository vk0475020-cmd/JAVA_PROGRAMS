class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];//xor of same number is zero ak dusre ko cencle kar dete hai
        }
        return ans;
    }
}