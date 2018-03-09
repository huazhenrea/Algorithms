package LinkedListNode;
class ListNode{
	 int val;
	 ListNode next;
	 ListNode(int x) {
		 val = x; 
	 }
}
public class reverseKGroupListNode {
	 public ListNode reverseKGroup(ListNode head, int k) {
	        if(head == null || head.next == null){
	            return head;
	        }
	        ListNode tail = head;
	        int count = 0;
	         while(tail != null && count < k){
	            tail = tail.next;
	            count++;
	        }
	        if(count < k){
	            return head;
	        }
	        
	        ListNode cur = head;
	        ListNode prev = null;
	        ListNode curTail = head;
	        
	        while(count > 0){
	            ListNode next = cur.next;
	            cur.next = prev;
	            prev = cur;
	            cur = next;
	            count--;
	        }
	        
	        curTail.next = reverseKGroup(tail, k);
	        return prev;
	       
	    }
}
