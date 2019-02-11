class ForEachMultiArr {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int[] outer : arr) {
            for (int inner : outer) {
                System.out.print(" " + inner);
            }
            System.out.println();
        }
    }
}