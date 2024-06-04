package arrays;

import java.util.ArrayList;

public class FindDuplicates {

    public static void main(String[] args) {

        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };

        findDuplicate(arr);
    }

    public static void findDuplicate(int[] arr){
        boolean ifPresent = false;
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (al.contains(arr[i])) {
                        break;
                    }


                    else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }
        if (ifPresent == true) {

            System.out.print(al + " ");
        }
        else {
            System.out.print(
                    "No duplicates present in arrays");
        }
    }
}
