class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int k = k1 + k2;

        int[] freq = new int[100001];

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            freq[diff]++;
        }

        for (int i = 100000; i > 0 && k > 0; i--) {
            if (freq[i] == 0) {
                continue;
            }

            int use = Math.min(freq[i], k);

            freq[i] -= use;
            freq[i - 1] += use;
            k -= use;
        }

        long ans = 0;

        for (int i = 1; i <= 100000; i++) {
            ans += (long) i * i * freq[i];
        }

        return ans;
    }
}