package problems.arrays.findmissingnumber

fun main(){

    val nums = intArrayOf(9,6,4,2,3,5,7,0,1)

    println(findMissingNumberFromRange(nums,))
}

fun findMissingNumberFromRange(nums : IntArray): Int{

    var allXors = 0

    for(i in 0..nums.size){
        allXors = allXors xor i
    }

    for (i in nums.indices){
        allXors = allXors xor nums[i]
    }

    return allXors
}