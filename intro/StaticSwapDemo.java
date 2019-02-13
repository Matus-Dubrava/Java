class StaticSwap {
    private int data;

    public StaticSwap(int d) {
        this.data = d;
    }

    public void setData(int d) {
        this.data = d;
    }

    public int getData() {
        return this.data;
    }

    public void swap(StaticSwap other) {
        int tmp = other.getData();
        other.setData(this.data);
        this.data = tmp;
    }
}

public class StaticSwapDemo {
    public static void main(String[] args) {
        StaticSwap o1 = new StaticSwap(3);
        StaticSwap o2 = new StaticSwap(5);

        System.out.println(o1.getData());
        System.out.println(o2.getData());

        o1.swap(o2);

        System.out.println(o1.getData());
        System.out.println(o2.getData());
    }
}