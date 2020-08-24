public class DiameterOfBinaryTree {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static void main(String[] args){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        System.out.println(diameterOfBinaryTree(a));
    }

    static int anw = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        /*
        노드 간 가장 긴 거리를 출력(edge의 개수, 굳이 루트부터 시작하는 게 아니여도 됨)
        자신을 기준으로, 왼쪽의 max depth, 오른쪽의 max depth를 구한다.
         */

        maxDepth(root);
        return anw;
    }
    public static int maxDepth(TreeNode root){
        if(root == null)
            return 0;

        int L = maxDepth(root.left);
        int R = maxDepth(root.right);

        anw = Math.max(anw, L + R);

        return Math.max(L, R) + 1;
    }
}
