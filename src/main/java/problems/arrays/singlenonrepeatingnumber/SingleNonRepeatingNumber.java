package problems.arrays.singlenonrepeatingnumber;

public class SingleNonRepeatingNumber {

    public static void main(String[] args){
        int[] arr = {4,1,2,1,2};


        System.out.print("Single no repeating number is -> "+findSingleNonRepeatingNumber(arr));

    }

    public static int findSingleNonRepeatingNumber(int[] arr){


        int number = 0;
        for (int i = 0; i< arr.length; i++){

            number = number ^ arr[i];
        }

        return number;
    }
}
