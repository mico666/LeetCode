package leetcode;

public class L104 {

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		} else {
			System.out.println("Again");
			System.out.println("Current Node: " + root.val);
			int leftDepth = maxDepth(root.left) + 1;
			System.out.println("left depth: " + leftDepth);
			int rightDepth = maxDepth(root.right) + 1;
			System.out.println("right depth: " + rightDepth);
			if (leftDepth >= rightDepth) {
				System.out.println("left in ");
				return leftDepth;
			} else {
				System.out.println("right in ");
				return rightDepth;
				
			}
		}
	}

	public static void main(String[] args) {

		// Creating nodes for the binary tree
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		// Constructing the binary tree
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;

		L104 l = new L104();
		int ans = l.maxDepth(node1);
		System.out.println("Final: " + ans);

	}

}
