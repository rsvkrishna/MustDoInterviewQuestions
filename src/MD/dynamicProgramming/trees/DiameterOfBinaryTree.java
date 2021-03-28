package MD.dynamicProgramming.trees;

public class DiameterOfBinaryTree {
    static int diameter;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        //System.out.println((root));
        diameter=-1;
        System.out.println(diameterOfBinaryTree(root));
    }
    private static int diameterOfBinaryTree(TreeNode root){

        if(root==null)
            return 0;

        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);

        int tempAns=1+Math.max(left,right);

        int ans=Math.max(tempAns,1+left+right);

        diameter=Math.max(ans,diameter);

        return tempAns;
    }
}
