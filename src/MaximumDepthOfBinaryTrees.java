
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

    private int depth=1;

    public static void main(String[] args) {

        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1, t2, t3);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(9);
        t2.left = t4;
        t4.left = t5;
        t6.left = t5;
        maxDepth(t1);

        System.out.println(t1);
    }

    public static int maxDepth(TreeNode t1) {
        if(t1==null){

        }
        return 0;
    }
}