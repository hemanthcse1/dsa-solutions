package arrays;

public class LargestNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int largest = findLargest(numbers);

        System.out.println("The first largest number in the array is: " + largest);
    }

    public static int findLargest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }
}
