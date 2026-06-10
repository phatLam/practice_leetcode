package com.phat.democompose

/**
 * LeetCode: MissingNumber
 */
class MissingNumber {
    fun solution(nums: IntArray): Int {

        var expectedSum = 0
        for (i in 1.. nums.size)
            expectedSum += i
        var actual = 0
        for (num in nums){
            actual += num
        }
        return expectedSum - actual
    }
}
