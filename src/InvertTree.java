public class InvertTree {
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

    public static void main(String[] args) {

        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t1 = new TreeNode(1, t2, t3);

        TreeNode qwe = invertTree(t1);

        System.out.println(qwe.left.val + " : " + qwe.right.val);
    }

    public static TreeNode invertTree(TreeNode root){
        if(root==null)
            return null;
        TreeNode newNode = new TreeNode(root.val);
        newNode.left = invertTree(root.right);
        newNode.right = invertTree(root.left);

        return newNode;
    }
}
