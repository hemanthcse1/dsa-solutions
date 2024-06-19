package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateNumbers {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findAllDuplicateNumbers(nums));;

    }

    public static List<Integer> findAllDuplicateNumbers(int[] nums){
        List<Integer> duplicateNums = new ArrayList<>();

        for (int i = 0; i< nums.length; i++){
            int index = Math.abs(nums[i]) -1 ;
            if (nums[index] < 0){
                duplicateNums.add(index +1);
            }
            nums[index] = nums[index] * -1;
        }
        return duplicateNums;
    }
}
