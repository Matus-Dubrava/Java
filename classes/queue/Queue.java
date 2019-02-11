class Queue {
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        if (this.tail != null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int val) {
        Node n = new Node(val);
        this.tail.addNext(n);
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Error: Queue is empty");
            return -1;
        } else {
            int result = this.head.getValue();
            this.head.getNext().removePrev();
            return result;
        }
    }

    public void showQueue() {
        Node current = this.head;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}