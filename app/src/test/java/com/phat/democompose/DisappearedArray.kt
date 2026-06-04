package com.phat.democompose

import kotlin.math.abs

class DisappearedArray {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        for (num in nums) {
            val idx = abs(num)- 1
            println(idx)
            nums[idx] = - abs(nums[idx])
        }
        for (i in nums.indices) {
            if (nums[i] > 0)
                result.add(i +1)
        }
        return result
    }
}
