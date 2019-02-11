class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.showQueue();

        queue.enqueue(2);
        queue.showQueue();

        queue.enqueue(3);
        queue.showQueue();

        queue.enqueue(4);
        queue.showQueue();

        queue.enqueue(5);
        queue.showQueue();

        queue.dequeue();
        queue.showQueue();

        queue.dequeue();
        queue.showQueue();

        queue.dequeue();
        queue.showQueue();

        queue.dequeue();
        queue.showQueue();

        queue.dequeue();
        queue.showQueue();
    }
}

class Queue {
    int[] queue;
    int head = 0;
    int tail = 0;

    Queue(int size) {
        queue = new int[size];
    }

    public int enqueue(int num) {
        if (tail - 1 == queue.length) {
            System.out.println("Error: queue overflow");
            return -1;
        }

        queue[tail] = num;
        tail++;
        return 1;
    }

    public boolean isEmpty() {
        if (head > tail) {
            return true;
        } else {
            return false;
        }
    }

    public int dequeue() {
        int result = queue[head];
        queue[head] = -1;
        head++;
        return result;
    }

    public void showQueue() {
        for (int i = 0; i < queue.length; i++) {
            System.out.print(" " + queue[i]);
        }
        System.out.println();
    }
}