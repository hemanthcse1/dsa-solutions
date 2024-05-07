package sorting;

public class BubbleSortAlgorithm {

    public static void main(String[] args){

        int[] arr = {5,6,9,8,2,3,1};
        int unSortedArraySize = arr.length-1;
        for (int i = 0; i< arr.length-1; i++){
            for (int j= 0; j< unSortedArraySize; j++){
                if (arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
            unSortedArraySize--;
        }

        for (int i : arr){
            System.out.println("value -> "+i);
        }
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
