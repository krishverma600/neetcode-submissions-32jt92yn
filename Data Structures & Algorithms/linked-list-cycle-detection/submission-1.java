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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<>();

        ListNode cur = head;
        while(cur!=null){
            if(hs.contains(cur)){
                return true;
            };
            hs.add(cur);
            cur = cur.next;
        }
        return false;

    }
}
