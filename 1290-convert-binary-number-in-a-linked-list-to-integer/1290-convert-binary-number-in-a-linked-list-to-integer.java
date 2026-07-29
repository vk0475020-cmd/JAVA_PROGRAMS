/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        head = reverse(head);
        int ans = 0;
        int power = 1;   
    // approach 
    // ~make an array and reverse it(lenthy process)
    // ~or reverse the linked list
    // ~then use the 0*2^0
        while (head != null) {
            ans = ans + head.val * power;
            power = power * 2;
            head = head.next;
        }

        return ans;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}