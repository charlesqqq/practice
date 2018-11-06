package easy;

public class MaximumDepthOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = new MaximumDepthOfBinaryTree().new TreeNode(1);
		root.left = new MaximumDepthOfBinaryTree().new TreeNode(2);
		root.right = new MaximumDepthOfBinaryTree().new TreeNode(3);
		root.right.left = new MaximumDepthOfBinaryTree().new TreeNode(4);
		root.right.left.right = new MaximumDepthOfBinaryTree().new TreeNode(5);
		System.out.println(new MaximumDepthOfBinaryTree().maxDepth(root));
	}
	
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		if (left == null && right == null)
			return 1;
		
		int leftDepth = maxDepth(left);
		int rightDepth = maxDepth(right);
		if (left == null)
			return 1 + rightDepth;
		if (right == null)
			return 1 + leftDepth;
		
		return 1 + Math.max(leftDepth, rightDepth);
	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int x) {
			val = x;
		}
	}
}