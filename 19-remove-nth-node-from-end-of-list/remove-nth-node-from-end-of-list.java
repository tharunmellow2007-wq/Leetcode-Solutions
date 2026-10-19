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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=1;
        ListNode temp=head;
        if(head==null){
            return null;
        }
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        if(len==1){
            return null;
        }
        temp=head;
        if(len-n==0){
            head=head.next;
            return head;
        }else{
        for(int i=1;i<len-n;i++){
            temp=temp.next;
        }
        }
        temp.next=temp.next.next;
        return head;
        
    }
}