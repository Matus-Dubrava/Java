class Outer {
    public int[] nums;

    public Outer(int[] n) {
        this.nums = n;
    }

    public void analyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    public class Inner {
        public int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) {
                    m = nums[i];
                }
            }

            return m;
        }

        public int max() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > m) {
                    m = nums[i];
                }
            }

            return m;
        }

        public double avg() {
            int a = 0;

            for (int i = 0; i < nums.length; i++) {
                a += nums[i];
            }

            return (double) a / nums.length;
        }
    }
}

public class OuterDemo {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 0, 5 };
        Outer o = new Outer(x);
        o.analyze();
    }
}