package com.phat.democompose

/**
 * LeetCode: MoveZeroes
 */
class MoveZeroes {
    fun solution(nums: IntArray) {
        // Người dùng sẽ tự viết logic ở đây
        var left = 0
        for (pos in nums.indices) {

                 if (nums[pos] == 0) continue
                else {
                    if (nums[pos] != 0) {
                        nums[left] = nums[pos]
                        if (left != pos)
                            nums[pos] = 0
                        left ++
                    }

                }
        }

    }
}
