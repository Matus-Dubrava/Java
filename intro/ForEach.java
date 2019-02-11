class ForEach {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }

        System.out.println("Average is: " + sum / arr.length);
    }
}