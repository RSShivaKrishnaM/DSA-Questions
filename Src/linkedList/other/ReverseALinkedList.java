package linkedList.other;

public class ReverseALinkedList {
	
	 public ListNode reverseList(ListNode head) {
	        
	        if(head == null || head.next==null){
	            return head;
	        }
	        
	        ListNode ptr0 = null;
	        ListNode ptr1 = head;
	        ListNode ptr2 = head.next;
	        
	        do{
	            ptr1.next = ptr0;
	            ptr0 = ptr1;
	            ptr1 = ptr2;
	            ptr2 = ptr2.next;
	        }while(ptr1!=null && ptr2!=null);
	        
	        ptr1.next = ptr0;
	        ptr0 = ptr1;
	        
	        return ptr0;
	    }

}
