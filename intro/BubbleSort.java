class BubbleSort {
    public static void main(String args[]) {

        int myArr[] = { 99, -10, 100123, 18, -978, 5623, 463, 9, 287, 49 };

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                if (myArr[j] < myArr[i]) {
                    int tmp = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + myArr[i]);
        }

        System.out.println();
    }
}