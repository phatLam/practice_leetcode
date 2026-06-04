package com.phat.democompose

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ContainDuplicate2 {
    fun containsDuplicate2(nums: IntArray, k: Int): Boolean {
        // using sliding window
        val seen = mutableSetOf<Int>()
        for (i in nums.indices) {
            if (i > k) {
                seen.remove(nums[i - k - 1])
            }
            if (nums[i] in seen) {
                return true
            }
            seen.add(nums[i])
        }
        return false
    }

    @Test
    fun testContainsDuplicate2() {
        val solution = ContainDuplicate2()
        
        // Case 1: nums = [1,2,3,1], k = 3 -> true
        assertTrue(solution.containsDuplicate2(intArrayOf(1, 2, 3, 1), 3))
        
        // Case 2: nums = [1,0,1,1], k = 1 -> true
        assertTrue(solution.containsDuplicate2(intArrayOf(1, 0, 1, 1), 1))
        
        // Case 3: nums = [1,2,3,1,2,3], k = 2 -> false
        assertFalse(solution.containsDuplicate2(intArrayOf(1, 2, 3, 1, 2, 3), 2))
    }
}
