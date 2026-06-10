package com.phat.democompose

import kotlin.math.abs

/**
 * LeetCode: SortedSquares
 * Given an integer array nums sorted in non-decreasing order, 
 * return an array of the squares of each number sorted in non-decreasing order.
 */
class SortedSquares {
    fun solution(nums: IntArray): IntArray {

        //convert to pos integer
        val result = IntArray(nums.size)
        var left = 0
        var right = nums.size - 1
        var index = nums.size -1
        while (left <= right) {
            if (abs(nums[left]) >= abs(nums[right])) {
                result[index]= nums[left] * nums[left]
                 left++
            } else {
                result[index] = nums[right]* nums[right]
                right--
            }
            index --
        }
        return result
    }
}
