package Notes.LinkedList;

public class DoubleLink {
    Node head;
    Node tail;
    int size;

    public DoubleLink() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayRev() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }

        while(last != null) {
            System.out.print(last.val + " <-> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if(node.val == val) {
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }

        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public void insertAfter(int val, int after) {
        Node temp = find(after);
        if(temp == null) {
            System.out.println("Node does not exist");
            return;
        }
        if(temp.next == null) {
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null) {
            node.next.prev = node;
        }
    }

    private class Node{
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
