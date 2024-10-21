package Notes.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node root;
    static Node temp = root;

    static void In_Order(Node temp) {
        if (temp == null)
            return;

        In_Order(temp.left);
//        SOP(temp.data + " ");
        In_Order(temp.right);
    }

    static void Pre_Order(Node temp) {
        if (temp == null)
            return;

//        SOP(temp.data + " ");
        Pre_Order(temp.left);
        Pre_Order(temp.right);
    }

    static void Post_Order(Node temp) {
        if (temp == null)
            return;

        Post_Order(temp.left);
        Post_Order(temp.right);
//        SOP(temp.data);
    }

    static void Level_Order(Node temp) {
        if (temp == null)
            return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while (!q.isEmpty()) {
            int levelsize = q.size();
            for (int i = 0; i < levelsize; i++) {    // for printing each level element in new line
                Node tempNode = q.poll();
                assert tempNode != null;
                System.out.println(tempNode.data + " ");

                if (tempNode.left != null)
                    q.add(tempNode.left);

                if (tempNode.right != null)
                    q.add(tempNode.right);
            }
            System.out.println();
        }
    }

    static void insert(int data) {
        Node temp = root;
        if (temp == null) {
            temp = new Node(data);
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp1 = q.poll();
            if (temp1.left == null) {
                temp1.left = new Node(data);
                break;
            } else {
                q.add(temp1.left);
            }

            if (temp1.right == null) {
                temp1.right = new Node(data);
                break;
            } else {
                q.add(temp1.right);
            }
        }

    }

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        In_Order(root);
        Pre_Order(root);
        Post_Order(root);
        Level_Order(root);
        root = null;

        int[] arr = {101, 102, 103, 104, 105, 106, 107};
        for (int j : arr) {
            insert(j);

            In_Order(root);
            Pre_Order(root);
            Post_Order(root);
            Level_Order(root);
        }
    }
}
