import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i])
                min = nums[i];

            if (max < nums[i])
                max = nums[i];

            set.add(nums[i]);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i))
                al.add(i);
        }

        return al;
    }
}