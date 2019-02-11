class ArrCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = i;
        }

        if (arr2.length <= arr1.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
        }

        showArray(arr1);
        showArray(arr2);
    }

    static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}