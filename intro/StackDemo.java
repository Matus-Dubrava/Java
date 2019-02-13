class Node {
    private int data;
    private Node next;
    private Node prev;

    public Node(int d) {
        this.data = d;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(Node n) {
        this.next = n;
    }

    public void setPrev(Node n) {
        this.prev = n;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }
}

class Stack {
    private Node top = null;

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        return false;
    }

    public void push(int d) {
        Node n = new Node(d);

        if (this.isEmpty()) {
            this.top = n;
        } else {
            this.top.setNext(n);
            n.setPrev(top);
            this.top = n;
        }
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int data = this.top.getData();
        this.top = this.top.getPrev();

        if (this.top != null) {
            this.top.setNext(null);
        }

        return data;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}