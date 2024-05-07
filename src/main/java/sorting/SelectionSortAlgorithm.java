package sorting;

public class SelectionSortAlgorithm {

    public static void main(String[] args) {

        int[] arr = {8, 6, 9, 4, 7, 2, 1};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
