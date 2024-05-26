package sorting;

public class BubbleSort {

    public static void main(String[] args) {


        int[] arr = {2,3,9,6,4,11,5,-1,1,7};

        int unSortedArray = arr.length-1;
        for (int i = 0; i< arr.length-1; i++){
            for (int j = 0; j< (unSortedArray-i); j++) {
                if (arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        for (int i: arr){
            System.out.println(i);
        }
    }
}
