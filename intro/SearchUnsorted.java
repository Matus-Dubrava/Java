class SearchUnsorted {
    public static void main(String[] args) {
        int[] arr = { 1, 10, 2, 8, -1, 2 };
        int target = 8;
        boolean found = false;

        for (int el : arr) {
            if (el == target) {
                System.out.println("target found: " + target);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("target not found");
        }
    }
}