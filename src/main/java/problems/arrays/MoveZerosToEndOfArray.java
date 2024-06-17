package problems.arrays;

public class MoveZerosToEndOfArray {

    public static void main(String[] args) {

        //int[] nums = {1,0,4,0,6,7,9,0,2};
        int[] nums = {0,1,0,3,12};

        // wont maintain order
       // moveZerosToEndOfArray(nums);

        // will maintain order
        maintainOrder(nums);

        for (int number: nums
             ) {
            System.out.print(number+" ");
        }

    }

    public static void maintainOrder(int[] nums){
        int lastNonZeroFoundAt = 0;

        for (int i = 0; i< nums.length; i++){
            if (nums[i] != 0){
                nums[lastNonZeroFoundAt++]  = nums[i];
            }
        }

        for (int i = lastNonZeroFoundAt; i< nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void moveZerosToEndOfArray(int[] nums){


        int i = 0;
        int j = nums.length -1;

        while (i < j){

            if (nums[i] == 0){
                if (nums[j] != 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }else {
                    j--;
                }
            }else {
                i++;
            }
        }
    }
}
