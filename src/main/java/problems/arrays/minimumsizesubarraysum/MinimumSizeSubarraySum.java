package problems.arrays.minimumsizesubarraysum;

public class MinimumSizeSubarraySum {


    public static void main(String[] args){


        int[] nums = {2,3,1,1,4,3};
        int target = 7;

        System.out.print("minimum length -> "+minSubarraySum(target,nums));
    }

    public static int minSubarraySum(int target, int[] nums){

        int minWindowLen = Integer.MAX_VALUE;
        int currentSum = 0;

        int low = 0;
        int high = 0;

        while (high < nums.length){

            currentSum += nums[high];
            high++;

            while (currentSum >= target){

                int currentWindowLen = high -low;

                minWindowLen = Math.min(currentWindowLen, minWindowLen);

                currentSum -= nums[low];
                low++;
            }
        }

        return minWindowLen == Integer.MAX_VALUE ? 0 : minWindowLen;
    }
}
