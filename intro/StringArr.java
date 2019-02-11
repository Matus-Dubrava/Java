class StringArr {
    public static void main(String[] args) {
        String[] arr = { "this", "is", "a", "test" };

        System.out.println(joinArray(arr));
    }

    public static String joinArray(String[] arr) {
        String result = "";

        for (String word : arr) {
            result += word + " ";
        }

        return result;
    }
}