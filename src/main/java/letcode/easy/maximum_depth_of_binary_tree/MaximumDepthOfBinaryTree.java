package letcode.easy.maximum_depth_of_binary_tree;

class TreeNode {
    //
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftSize = maxDepth(root);
        int rightSize = maxDepth(root.right);
        return Math.max(leftSize, rightSize);
    }
}

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        //
        TreeNode left = new TreeNode(2);

        TreeNode right = new TreeNode(3);

        TreeNode root = new TreeNode(1, left, right);

        Solution solution = new Solution();

        System.out.println(solution.maxDepth(root));
    }
}


