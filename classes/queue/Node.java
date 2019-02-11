class Node {
    private Node next;
    private Node prev;
    private int val;

    public Node(int v) {
        this.val = v;
    }

    public void addNext(Node n) {
        this.next = n;
        n.prev = this;
    }

    public void addPrev(Node n) {
        this.prev = n;
        n.next = this;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public int getValue() {
        return this.val;
    }

    public void setValue(int v) {
        this.val = v;
    }

    public void removeNext() {
        this.next = null;
    }

    public void removePrev() {
        this.prev = null;
    }
}