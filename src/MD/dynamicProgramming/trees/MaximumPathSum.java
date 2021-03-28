package MD.dynamicProgramming.trees;

public class MaximumPathSum {
    static int maxSum;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(10);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(-30);

        root.right = new TreeNode(20);
        root.right.left = new TreeNode(-10);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(25);


        maxSum=Integer.MIN_VALUE;
        System.out.println("Maximum Path Sum between 2 leafs " + maxPathSum(root));
    }
    private static int maxPathSum(TreeNode root){
        if(root==null)
            return 0;

        if(root.left==null && root.right==null)
            return root.val;

        int left=maxPathSum(root.left);
        int right=maxPathSum(root.right);

        int tempAns=root.val+Math.max(left,right);

        if(left!=0 && right!=0)
            maxSum=Math.max(maxSum,root.val+left+right);

        return maxSum;
    }
}
