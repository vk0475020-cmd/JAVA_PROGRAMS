class Solution {
    public int maxProduct(int[] nums) {
        int max=0,max2=0;
        Arrays.sort(nums);
        int l=nums.length;
        max=nums[l-2];
        max2=nums[l-1];
        return (max-1)*(max2-1);

    }
}