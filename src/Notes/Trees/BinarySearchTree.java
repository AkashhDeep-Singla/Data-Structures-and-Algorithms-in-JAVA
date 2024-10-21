package Notes.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static Node root;

    static Node insert(Node temp, int data) {
        if (temp == null)
            return new Node(data);

        if (data < temp.data)
            temp.left = insert(temp.left, data);
        else if (data > temp.data)
            temp.right = insert(temp.right, data);

        return temp;
    }

    static void levelOrder(Node temp) {
        if (temp == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(temp);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                Node tempNode = q.poll();
                System.out.print(tempNode.data + " ");

                if (tempNode.left != null)
                    q.add(tempNode.left);
                if (tempNode.right != null)
                    q.add(tempNode.right);
            }
            System.out.println();
        }
    }

    static boolean search(Node temp, int target) {
        if (temp == null)
            return false;
        if (temp.data == target)
            return true;

        return (target < temp.data) ? search(temp.left, target) : search(temp.right, target);
    }

    static Node deleteBST(Node temp) {
        if (temp != null) {
            deleteBST(temp.left);
            deleteBST(temp.right);
            System.out.println(temp.data);
            temp = null;
        }
        return null;
    }

    static Node deleteNode(Node temp, int target) {
        if (temp == null)
            return temp;

        if (target < temp.data)
            temp.left = deleteNode(temp.left, target);
        else if (target > temp.data)
            temp.right = deleteNode(temp.right, target);
        else {
            if (temp.left == null)
                return temp.right;
            else if (temp.right == null)
                return temp.left;

            temp.data = minValue(temp.right).data;
            temp.right = deleteNode(temp.right, temp.data);
        }
        return temp;
    }

    static Node minValue(Node temp) {
        Node temp1 = temp;
        while (temp1.left != null)
            temp1 = temp1.left;
        return temp1;
    }

    static void printNodeOfLevel(Node temp, int level) {
        if (temp == null)
            return;
        if (level == 1)
            System.out.print(temp.data + " ");
        else if (level > 1) {
            printNodeOfLevel(temp.left, level - 1);
            printNodeOfLevel(temp.right, level - 1);
        }
    }

    static void printLeafNodes(Node temp) {
        if (temp == null)
            return;
        if (temp.left == null && temp.right == null) {
            System.out.print(temp.data + " ");
            return;
        }
        if (temp.left != null)
            printLeafNodes(temp.left);
        if (temp.right != null)
            printLeafNodes(temp.right);
    }

    static int maxLevel = 0;
    static void rightView(Node temp, int level) {
        if (temp == null)
            return;

        if (maxLevel < level) {
            System.out.print(temp.data + " ");
            maxLevel = level;
        }
        rightView(temp.right, level + 1);
        rightView(temp.left, level + 1);
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 6, 4, 7, 10, 14, 13};
        root = insert(root, arr[0]); // Initialize the root node
        for (int i = 1; i < arr.length; i++) {
            insert(root, arr[i]);
        }

        boolean found = search(root, 10);
        System.out.println("Node 10 found: " + found);

        levelOrder(root);

        root = deleteBST(root);
        System.out.println("Deleted all nodes:");

        root = insert(root, arr[0]); // Rebuild the tree
        for (int i = 1; i < arr.length; i++) {
            insert(root, arr[i]);
        }

        System.out.println("\nNodes at level 3:");
        printNodeOfLevel(root, 3);

        System.out.println("\nLeaf nodes:");
        printLeafNodes(root);

        System.out.println("\nRight view:");
        rightView(root, 1);
    }
}