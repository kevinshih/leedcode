package leedcode;

/**
 * 700. Search in a Binary Search Tree
 * @author kevin.shih
 *
 */
public class SearchBST {
	
	public TreeNode searchBST(TreeNode root, int val) {
		
		if(root == null)
			return null;
		else if(root.val==val)
			return root;
		else if(root.val<val)
			return searchBST(root.right,val);
		else
			return searchBST(root.left,val);
			
        
    }
}
