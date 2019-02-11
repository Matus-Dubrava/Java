class TwoDimArray {
    public static void main(String args[]) {
        int arr[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (4 * i) + j + 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    static void showArray(int arr[][], int ySize, int xSize) {
        for (int i = 0; i < ySize; i++) {
            for (int j = 0; j < xSize; j++) {

                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}