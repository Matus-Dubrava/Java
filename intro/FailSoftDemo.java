class FailSoftArray {
    private int[] arr;
    private int errval;
    public int length;

    public FailSoftArray(int size, int errv) {
        arr = new int[size];
        errval = errv;
        length = size;
    }

    public boolean indexOK(int index) {
        if (index >= 0 & index < length) {
            return true;
        }
        return false;
    }

    public int get(int index) {
        if (indexOK(index)) {
            return arr[index];
        }
        return errval;
    }

    public boolean put(int index, int value) {
        if (indexOK(index)) {
            arr[index] = value;
            return true;
        }
        return false;
    }
}

class FailSoftDemo {
    public static void main(String[] args) {
        FailSoftArray arr = new FailSoftArray(5, -1);

        System.out.println(arr.put(4, 5));
        System.out.println(arr.put(10, 5));

        System.out.println(arr.get(4));
        System.out.println(arr.get(10));
        System.out.println(arr.get(1));
    }
}