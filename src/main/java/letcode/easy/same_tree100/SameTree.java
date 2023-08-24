package letcode.easy.same_tree100;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode();
        p.val = 1;
        TreeNode p_left = new TreeNode();
        p_left.val = 2;
        p.left = p_left;
        TreeNode right = new TreeNode();
        right.val = 3;
        p.right = right;

        TreeNode q = new TreeNode();
        q.val = 1;
        TreeNode q_left = new TreeNode();
        q_left.val = 2;
        q.left = q_left;
        TreeNode q_right = new TreeNode();
        q_right.val = 4;
        q.right = q_right;

        System.out.println(isSameTree(p, q));
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p!=null && q==null) || (p==null && q!=null) || p.val != q.val) return false;

        boolean result = true;

        result = result && isSameTree(p.left, q.left);
        result = result && isSameTree(p.right, q.right);

        return result;
    }

}
