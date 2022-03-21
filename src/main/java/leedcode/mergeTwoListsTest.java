package leedcode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * @author kevin.shih
 *
 */
public class mergeTwoListsTest {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.value < l2.value) {
            l1.nextNode = mergeTwoLists(l1.nextNode, l2);
            return l1;
        } else {
            l2.nextNode = mergeTwoLists(l1, l2.nextNode);
            return l2;
        }
	}
		
	
	public static void main(String[] args) {
		ListNode linkedList1 = creatLinkedList();
		ListNode linkedList2 = creatLinkedList2();
		ListNode ans = mergeTwoLists(linkedList1, linkedList2);
		for(;;) {
			System.out.println(ans.value);
			ans = ans.nextNode;
			if(ans.nextNode==null)
				break;
		}
	}
	
	public static ListNode creatLinkedList() {
		
		ListNode cPtr = null;
		ListNode fPtr = null;
		
		ListNode t1 = new ListNode(1);
		cPtr = t1;
		fPtr = t1;
		ListNode t2 = new ListNode(2);
		cPtr.nextNode = t2;
		cPtr = t2;
		ListNode t3 = new ListNode(4);
		cPtr.nextNode = t3;
		cPtr = t3;
		
		
	    return fPtr;
	}
	
public static ListNode creatLinkedList2() {
		
		ListNode cPtr = null;
		ListNode fPtr = null;
		
		ListNode t1 = new ListNode(1);
		cPtr = t1;
		fPtr = t1;
		ListNode t2 = new ListNode(3);
		cPtr.nextNode = t2;
		cPtr = t2;
		ListNode t3 = new ListNode(4);
		cPtr.nextNode = t3;
		cPtr = t3;
		
		
	    return fPtr;
	}
}
