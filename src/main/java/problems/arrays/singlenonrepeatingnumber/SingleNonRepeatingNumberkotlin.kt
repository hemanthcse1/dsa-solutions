package problems.arrays.singlenonrepeatingnumber

fun main(){

    val nums = intArrayOf(4,1,2,1,2);


    println("Missing number -> "+findSingleNonRepeatingNumber(nums))
}

fun findSingleNonRepeatingNumber(nums: IntArray): Int{

    var number = 0;
    for (i in nums.indices){
        number =  number xor nums[i]
    }
    return number
}