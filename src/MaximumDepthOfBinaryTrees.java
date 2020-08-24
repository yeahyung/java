
public class MaximumDepthOfBinaryTrees {
    public static class TreeNode {
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

    private static int anw=0;

    public static void main(String[] args) {

        /*TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1, t2, t3);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(9);
        t2.left = t4;
        t4.left = t5;
        t6.left = t5;*/
        TreeNode t1 = null;
        System.out.println(maxDepth(t1));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}