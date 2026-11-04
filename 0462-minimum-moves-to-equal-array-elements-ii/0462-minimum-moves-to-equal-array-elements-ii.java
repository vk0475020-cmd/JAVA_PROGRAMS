class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int mid=nums[l/2],s=0;
        for(int i=0;i<nums.length;i++){
            s+=Math.abs(nums[i]-mid);
        }
        return s;
    }
}