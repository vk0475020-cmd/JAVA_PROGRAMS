class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] min = new int[n];//store the min no in array from last

        int minEl = Integer.MAX_VALUE;

        for (int i = n - 1; i >= 0; i--) {     // Right -> Left
            minEl = Math.min(minEl, nums[i]);
            min[i] = minEl;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (max - min[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}