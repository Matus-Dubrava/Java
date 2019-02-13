class VarSum {
    static int sum(int... nums) {
        int sum = 0;

        for (int n : nums) {
            sum += n;
        }

        return sum;
    }
}

public class VarSumDemo {
    public static void main(String[] args) {
        System.out.println(VarSum.sum(1, 2, 3, 4, 5));
    }
}