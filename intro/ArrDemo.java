class ArrDemo {
    public static void main(String args[]) {
        int myArr[] = new int[10];
        int min, max;

        myArr[0] = 99;
        myArr[1] = -10;
        myArr[2] = 100123;
        myArr[3] = 18;
        myArr[4] = -978;
        myArr[5] = 5623;
        myArr[6] = 463;
        myArr[7] = -9;
        myArr[8] = 287;
        myArr[9] = 49;

        min = max = myArr[0];

        for (int i = 1; i < 10; i++) {
            if (min > myArr[i]) {
                min = myArr[i];
            }
            if (max < myArr[i]) {
                max = myArr[i];
            }
        }

        System.out.println("min is: " + min + ", max is: " + max);
    }
}