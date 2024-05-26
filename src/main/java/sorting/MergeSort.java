package sorting;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {8,3,6,2,9,1,7,4,5};

        mergeSort(arr,arr.length);

        for (int i : arr){
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] arr, int totalNumberOfItems){
        if (totalNumberOfItems < 2){
            return;
        }

        int mid = totalNumberOfItems/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[totalNumberOfItems-mid];

        for (int i = 0; i<mid; i++){
            leftArr[i] = arr[i];
        }

        for (int i = mid; i < totalNumberOfItems; i++){
            rightArr[i-mid] = arr[i];
        }

        mergeSort(leftArr,mid);
        mergeSort(rightArr,totalNumberOfItems-mid);

        merge(arr, leftArr,rightArr,mid, totalNumberOfItems-mid);

    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right){
        int i= 0, j=0, k=0;

        while (i < left && j < right){
            if (leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            }else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < left){
            arr[k++] = leftArr[i++];
        }

        while (j < right){
            arr[k++] = rightArr[j++];
        }
    }
}
