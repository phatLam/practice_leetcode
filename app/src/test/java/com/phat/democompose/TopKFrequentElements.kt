package com.phat.democompose

/**
 * LeetCode: TopKFrequentElements
 */
class TopKFrequentElements {
    fun solution(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (num in nums) {
            map[num] = (map[num] ?: 0) + 1
        }

        // Bước 2: Dùng Bucket Sort (Mảng các danh sách)
        // Index của mảng chính là tần suất (frequency)
        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }
        for ((num, frequency) in map) {
            buckets[frequency].add(num)
        }

        var count = 0
        val result = IntArray(k)
        for (i in buckets.size-1 downTo 0){
            for ( num in buckets[i]) {
                if (count < k) {
                    result[count ++] = num
                } else
                    return result
            }
        }
        return result
    }
}
