package com.phat.democompose

import org.junit.Assert.assertArrayEquals
import org.junit.Test

/**
 * LeetCode: Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }

    @Test
    fun testTwoSum() {
        val solution = TwoSum()
        
        // Case 1
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(2, 7, 11, 15), 9))
        
        // Case 2
        assertArrayEquals(intArrayOf(1, 2), solution.twoSum(intArrayOf(3, 2, 4), 6))
        
        // Case 3
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(3, 3), 6))
    }
}
