package problems.arrays.singlenonrepeatingnumber;

public class SingleNonRepeatingNumber {

    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};


        System.out.print("Single no repeating number is -> "+findSingleNonRepeatingNumber(nums));

    }

    public static int findSingleNonRepeatingNumber(int[] nums){


        int number = 0;
        for (int i = 0; i< nums.length; i++){

            number = number ^ nums[i];
        }

        return number;
    }
}
