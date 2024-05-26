package sorting;

public class InsertionSort {

    public static void main(String[] args) {


        int[] arr = {5,2,1,3,7,6,-1,11,-2};

        int n = arr.length;

        for (int i = 0; i< n; i++) {
            int mid_index = i;
            for (int j = i+1; j< n; j++){
                if (arr[j] < arr[mid_index]){
                    mid_index = j;
                }
            }


            int temp = arr[mid_index];
            arr[mid_index] = arr[i];
            arr[i] = temp;
        }


        for (int i : arr){
            System.out.println(i);
        }
    }
}
