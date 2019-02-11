import java.util.ArrayList;
import java.util.List;

class QuickSort {
    private List<Integer> joinArrays(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> arr = new ArrayList<Integer>();
        for (int el : arr1) {
            arr.add(el);
        }
        for (int el : arr2) {
            arr.add(el);
        }
        return arr;
    }

    private List<Integer> appendToArray(List<Integer> arr, int num) {
        arr.add(num);
        return arr;
    }

    public List<Integer> sort(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        } else {
            List<Integer> smaller = new ArrayList<Integer>();
            List<Integer> bigger = new ArrayList<Integer>();

            for (int i = 1; i < arr.size(); i++) {
                int firstVal = arr.get(0);
                int currentVal = arr.get(i);

                if (currentVal <= firstVal) {
                    smaller.add(currentVal);
                } else if (currentVal > firstVal) {
                    bigger.add(currentVal);
                }
            }

            return this.joinArrays(this.appendToArray(this.sort(smaller), arr.get(0)), this.sort(bigger));
        }
    }
}

class QuickSortDemo {
    public static void main(String[] args) {
        QuickSort q = new QuickSort();

        List<Integer> arr1 = new ArrayList<Integer>();

        arr1.add(1);
        arr1.add(10);
        arr1.add(-1);
        arr1.add(89);
        arr1.add(-123);
        arr1.add(3);
        arr1.add(1);

        System.out.println(q.sort(arr1));
    }
}