package Notes.LinkedList;

public class CustomLink {
    private Node head;
    private Node tail;
    private int size;

    public CustomLink() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node get(int index) {
        Node node = head;
        for (int i=1; i<index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;  //new node points to head as its next element and head becomes second element in the list
        head = node;   // newly created node is made new head so that head remains at start of the list
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        if(index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }
        Node  node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if(size <= 1) {
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int deleteAt(int index) {
        if(index == 0) {
            deleteFirst();
        }
        if(index == size-1) {
            deleteLast();
        }

        Node prevNode = get(index - 1);
        int val = prevNode.val;
        prevNode.next = prevNode.next.next;

        return val;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
