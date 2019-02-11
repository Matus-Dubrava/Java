class Factorial {
    public int compute(int value) {
        if (value == 0) {
            return 1;
        } else {
            return value * compute(value - 1);
        }
    }
}

class FactorialDemo {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.compute(6));
    }
}