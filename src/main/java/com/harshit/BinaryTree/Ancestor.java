package com.harshit.BinaryTree;


//lowest comman ancestor
public class Ancestor {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root.val==p.val||root.val==q.val)
            return root;
        TreeNode lca=lowestCommonAncestor(root.left,p,q);
        TreeNode rla=lowestCommonAncestor(root.right,p,q);

        if(lca==null)
            return rla;
        if(rla==null)
            return lca;
        return root;
    }
    public static void main(String[] args) {

    }
}
