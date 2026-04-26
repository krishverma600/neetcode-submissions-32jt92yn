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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode node1 = list1;
        ListNode node2 = list2;

        if(node1==null) return node2;
        if(node2==null) return node1;

        ListNode head;

        if(node1.val <= node2.val ){
            head = node1;
            node1= node1.next;
        } 
        else {
            head=node2;
            node2 = node2.next;
        }

        ListNode temp = head;

        while(node1!=null && node2!=null){
            if(node1.val < node2.val){
                temp.next = node1;
                node1 = node1.next;
            }
            else{
                temp.next = node2;
                node2 = node2.next;
            }
            temp = temp.next;
        }
            if(node1!=null){
                temp.next = node1;
            }
            if(node2!=null){
                temp.next = node2;
            }
        return head;

    }
}