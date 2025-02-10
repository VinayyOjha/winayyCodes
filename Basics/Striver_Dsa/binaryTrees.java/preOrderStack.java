import java.util.*;

public class preOrderStack{
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution s = new Solution();
        List <Integer> ans = s.preOrderTraversal(root);
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        this.data = x;
        left = null;
        right = null;
    }
}

class Solution{
    public List<Integer> preOrderTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        if (root == null) return list;

        while(!st.isEmpty()){
            st.push(root);
        }
        System.out.println(st);
        return list;
    }
}