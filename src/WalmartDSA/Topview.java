package WalmartDSA;

import java.util.*;

class BinaryTree {
    // Binary Tree Node definition
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Class to store node and its horizontal distance
    // Class to store node and its horizontal distance or level
    static class Pair {
        Node node;
        Integer horizontalDistance; // This will be used for top view
        Integer level; // This will be used for left/right view

        // Constructor for top view or left/right view based on usage
        Pair(Node node, Integer horizontalDistance, Integer level) {
            this.node = node;
            this.horizontalDistance = horizontalDistance;
            this.level = level;
        }
    }


    // Function to print the right view of the binary tree
    public static void printRightView(Node root) {
        if (root == null) return;

        // Queue for level-order traversal
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, null,0));

        // To store the rightmost node at each level
        Map<Integer, Integer> rightViewMap = new HashMap<>();

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            Node currentNode = pair.node;
            int currentLevel = pair.level;

            // Overwrite the map at the current level with the current node (last node at each level)
            rightViewMap.put(currentLevel, currentNode.data);

            // Add children to the queue with the updated level
            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, null,currentLevel + 1));
            }
            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right,null, currentLevel + 1));
            }
        }

        // Print the right view by iterating through the levels (top to bottom)
        rightViewMap.forEach((k, v) -> System.out.print(v + " "));
    }

    // Function to print the left view of the binary tree
    public static void printLeftView(Node root) {
        if (root == null) return;

        // Queue for level-order traversal
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, null,0));

        // To store the leftmost node at each level
        Map<Integer, Integer> leftViewMap = new HashMap<>();

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            Node currentNode = pair.node;
            int currentLevel = pair.level;

            // Only update the map if we are at a new level
            if (!leftViewMap.containsKey(currentLevel)) {
                leftViewMap.put(currentLevel, currentNode.data);
            }

            // Add children to the queue with the updated level
            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, null,currentLevel + 1));
            }
            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, null,currentLevel + 1));
            }
        }

        // Print the left view by iterating through the levels (top to bottom)
        leftViewMap.forEach((k, v) -> System.out.print(v + " "));
    }

    // Function to print the top view of the binary tree
    public static void printTopView(Node root) {
        if (root == null) return;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0,null));

        // To store the topmost node at each horizontal distance
        TreeMap<Integer, Integer> topViewMap = new TreeMap<>();

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            Node currentNode = pair.node;
            int horizontalDistance = pair.horizontalDistance;

            // Only update the map if the horizontal distance is not already encountered
            if (!topViewMap.containsKey(horizontalDistance)) {
                topViewMap.put(horizontalDistance, currentNode.data);
            }

            // Add children to the queue with the updated horizontal distance
            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, horizontalDistance - 1,null));
            }
            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, horizontalDistance + 1, null));
            }
        }

        // Print the top view by iterating through the horizontal distances (left to right)
        topViewMap.forEach((k, v) -> System.out.print(v + " "));
    }

    public static void main(String[] args) {
        // Creating a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.right.left.right = new Node(10);

        // Printing the top view of the binary tree
        System.out.print("Top View: ");
        printTopView(root);
        System.out.println();

        // Printing the right view of the binary tree
        System.out.print("Right View: ");
        printRightView(root);
        System.out.println();

        // Printing the left view of the binary tree
        System.out.print("Left View: ");
        printLeftView(root);
    }
}
