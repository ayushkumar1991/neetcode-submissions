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
        ListNode dummy = new ListNode(0);
        ListNode pointr = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                pointr.next = list1;
                list1 = list1.next;
            } else{
                pointr.next = list2;
                list2 = list2.next;
            }
            pointr = pointr.next;
        }

        if(list1 != null) pointr.next = list1;
        if(list2 != null) pointr.next = list2;

        return dummy.next;
    }
}