package linkedList.twoPointers;

public class RemoveNthNodeFromLast {
	  public ListNode removeNthFromEnd(ListNode head, int n) {
	        // take two pointers 
	        // first pointing to head
	        // second pointing to head  + n+1th node
	        // move both pointers till second pointer reaches last node
	        // now first pointer will be pointing to n+1 node from last node
	        // using first pointer remove nth node
//	         if(head.next==null && n==1){
//	             return null;
//	         }
//	         ListNode firstPointer = head;
//	         ListNode secPointer = head;
//	         int i = 1;
//	         while(i==n){
//	             secPointer = secPointer.next;
//	             i++;
//	         }
	        
//	         while(secPointer.next!=null){
//	             firstPointer = firstPointer.next;
//	             secPointer = secPointer.next;
//	         }
//	         System.out.println(firstPointer.val);
//	         // firstPointer.next = firstPointer.next.next;
//	         return head;
	         ListNode start = new ListNode(0);
	        start.next = head;
	        ListNode slow = start;
	        ListNode fast = start;
	        for (int i = 1 ; i <= n+1 ; i++) {
	            fast = fast.next;
	        }
	        while(fast != null) {
	            slow = slow.next;
	            fast = fast.next;
	        }
	        
	        slow.next = slow.next.next;
	        return start.next;
	    }
}
