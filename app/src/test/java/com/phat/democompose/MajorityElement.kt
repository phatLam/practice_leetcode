package com.phat.democompose

/**
 * LeetCode: MajorityElement
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 */
class MajorityElement {
    fun solution(nums: IntArray): Int {
        // Người dùng sẽ tự viết logic ở đây (Gợi ý: Thuật toán Boyer-Moore Voting)
        var candidate = 0
        var count = 0
        for (num in nums) {
            if (count == 0)
                candidate = num
            if (candidate == num)
                count ++
            else count --
        }
        return candidate
    }
}
