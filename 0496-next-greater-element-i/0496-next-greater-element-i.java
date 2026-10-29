
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> helperStack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            while (!helperStack.isEmpty() &&
                   helperStack.peek() <= element) {
                helperStack.pop();
            }

            if (helperStack.isEmpty()) {
                map.put(element, -1);
            } else {
                map.put(element, helperStack.peek());
            }

            helperStack.push(element);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
