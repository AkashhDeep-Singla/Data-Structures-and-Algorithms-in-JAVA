package Notes;

import java.util.Scanner;

public class Trees {
    public Trees() {

    }

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public void populate(Scanner scan) {
        System.out.print("Enter the root Node : ");
        int val = scan.nextInt();
        root = new Node(val);
        populate(scan, root);
    }

    private void populate(Scanner scan, Node node) {
        System.out.println("Add on left side of " + node.val + " ?");
        int left = scan.nextInt();
        if(left != -1) {
            node.left = new Node(left);
            populate(scan, node.left);
        }
        System.out.println("Add on right side of " + node.val + " ?");
        int right = scan.nextInt();
        if(right != -1) {
            node.right = new Node(right);
            populate(scan, node.right);
        }
    }

    public void display() {
        displayTree(root, "", true);
    }

    private void displayTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.val);
            displayTree(node.left, prefix + (isLeft ? "│   " : "    "), true);
            displayTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Trees tree = new Trees();
        tree.populate(scan);
        tree.display();
    }
}