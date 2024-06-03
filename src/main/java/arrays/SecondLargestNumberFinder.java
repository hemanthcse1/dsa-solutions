package arrays;

public class SecondLargestNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(numbers);

        System.out.println("The second largest number in the array is: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }
}
