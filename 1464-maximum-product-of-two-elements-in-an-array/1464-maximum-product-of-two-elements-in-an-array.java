class Solution {
    public int maxProduct(int[] nums) {
        int max=0,max2=0;
        for(int i:nums){
            if(i>max){
                max2=max;
                max=i;
            }else if(i>max2)
                max2=i;//Agar current number sabse bada (max1) nahi hai, lekin second largest (max2) se bada hai, to use second largest bana dofor example [3,5,4] 
        }
        // Arrays.sort(nums);
        // int l=nums.length;
        // max=nums[l-2];
        // max2=nums[l-1];
        return (max-1)*(max2-1);

    }
}