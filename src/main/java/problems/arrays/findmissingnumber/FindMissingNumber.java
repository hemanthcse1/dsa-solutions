package problems.arrays.findmissingnumber;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {3,0,1};

        System.out.println(findMissingNumberInRange(arr));
    }

    public static int findMissingNumberInRange(int[] nums){

        int allXORNo = 0;

        for (int i = 0; i<= nums.length; i++){
            allXORNo = allXORNo ^ i;
        }

        for (int j = 0; j< nums.length; j++){
            allXORNo = allXORNo ^ nums[j];
        }

        return allXORNo;
    }
}
