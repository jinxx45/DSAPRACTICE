package BinaryTree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeBFS {

    public List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levelElements = new ArrayList<>();

            for(int i=0;i< levelSize;i++){
                TreeNode current = queue.poll();
                levelElements.add(current.val);

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            result.add(levelElements);
        }
        return result;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BinaryTreeBFS tree = new BinaryTreeBFS();
        List<List<Integer>> result = tree.bfs(root);

        System.out.println("BFS Level Order Traversal:");
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}