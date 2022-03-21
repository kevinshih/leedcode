package leedcode;

import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * @author kevin.shih
 *
 */
public class LevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
        
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
	
}