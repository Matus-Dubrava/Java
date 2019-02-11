class SqrsArray {
    public static void main(String args[]) {

        int arr[][] = { { 1, 1 }, { 2, 4 }, { 3, 9 }, { 4, 16 }, { 5, 25 } };
        int sizeX = 5;
        int sizeY = 2;

        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}