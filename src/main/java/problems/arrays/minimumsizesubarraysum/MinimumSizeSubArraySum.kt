package problems.arrays.minimumsizesubarraysum


fun main(){

    var nums = intArrayOf(2,3,1,2,4,3)
    var target = 7

    println("result -> ${minSubarraySum(target,nums)}")

}

fun minSubarraySum(target: Int, nums: IntArray):Int{


    var minWindowLen = Int.MAX_VALUE
    var currentSum = 0;

    var low = 0;
    var high = 0;

    while (high < nums.size){

        currentSum += nums[high]
        high++

        while (currentSum >= target){

            var currentWindowLen = high - low

            minWindowLen = kotlin.math.min(currentWindowLen, minWindowLen)
            currentSum -= nums[low];
            low++
        }
    }

    return if (minWindowLen == Int.MAX_VALUE) 0 else minWindowLen
}