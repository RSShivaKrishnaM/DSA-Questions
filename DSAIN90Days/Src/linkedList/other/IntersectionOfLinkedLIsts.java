package linkedList.other;

import java.util.HashSet;
import java.util.Set;

//  Definition for singly-linked list.
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
 
public class IntersectionOfLinkedLIsts {
    public ListNode getIntersectionNodeUsingSet(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
            return null;
        
        Set<ListNode> set = new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
    
    private int countA = 0;
    private int countB = 0;
        
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
      
        ListNode tmpHeadA = headA;
        ListNode tmpHeadB = headB;
        
        while (tmpHeadA != null) {
            countA++;
            tmpHeadA = tmpHeadA.next;
        }
        
        while (tmpHeadB != null) {
            countB++;
            tmpHeadB = tmpHeadB.next;
        }
        
        while (countA > countB) {
            headA = headA.next;
            countA--;
        } 
        
        while (countB > countA) {
            headB = headB.next;
            countB--;
        }
        
        while(headA != null && headB != null) {
            
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
    }
}
        