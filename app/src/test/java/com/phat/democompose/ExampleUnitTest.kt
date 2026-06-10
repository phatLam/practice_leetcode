package com.phat.democompose

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun testContainDuplicate() {
        val containDuplicate = ContainDuplicate()
        assertFalse(containDuplicate.containsDuplicate(intArrayOf(1, 2, 3, 4)))
        assertTrue(containDuplicate.containsDuplicate(intArrayOf(1, 2, 3, 1)))
    }

    @Test
    fun testTwoSum() {
        val twoSum = TwoSum()
        assertArrayEquals(intArrayOf(0, 1), twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9))
        assertArrayEquals(intArrayOf(1, 2), twoSum.twoSum(intArrayOf(3, 2, 4), 6))
        assertArrayEquals(intArrayOf(0, 1), twoSum.twoSum(intArrayOf(3, 3), 6))
    }

    @Test
    fun testDisappearedArray() {
        val disappearedArray = DisappearedArray()
        assertEquals(listOf(5, 6), disappearedArray.findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
        assertEquals(listOf(2), disappearedArray.findDisappearedNumbers(intArrayOf(1, 1)))
    }

    @Test
    fun testMissingNumber() {
        val solver = MissingNumber()
        assertEquals(2, solver.solution(intArrayOf(3, 0, 1)))
        assertEquals(2, solver.solution(intArrayOf(0, 1)))
        assertEquals(8, solver.solution(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
    }

    @Test
    fun testTopKFrequentElements() {
        val solver = TopKFrequentElements()
        assertArrayEquals(intArrayOf(1, 2), solver.solution(intArrayOf(1, 1, 1, 2, 2, 3), 2).sortedArray())
        assertArrayEquals(intArrayOf(1), solver.solution(intArrayOf(1), 1))
        assertArrayEquals(intArrayOf(-1), solver.solution(intArrayOf(-1, -1), 1))
    }

    @Test
    fun testMajorityElement() {
        val solver = MajorityElement()
        assertEquals(3, solver.solution(intArrayOf(3, 2, 3)))
        assertEquals(2, solver.solution(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
        assertEquals(5, solver.solution(intArrayOf(5)))
    }

    @Test
    fun testMoveZeroes() {
        val solver = MoveZeroes()

        val nums1 = intArrayOf(0, 1, 0, 3, 12)
        solver.solution(nums1)
        assertArrayEquals(intArrayOf(1, 3, 12, 0, 0), nums1)

        val nums2 = intArrayOf(0)
        solver.solution(nums2)
        assertArrayEquals(intArrayOf(0), nums2)

        val nums3 = intArrayOf(1, 2, 3)
        solver.solution(nums3)
        assertArrayEquals(intArrayOf(1, 2, 3), nums3)
    }

    @Test
    fun testSortedSquares() {
        val solver = SortedSquares()
        
        assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), solver.solution(intArrayOf(-4, -1, 0, 3, 10)))
        assertArrayEquals(intArrayOf(4, 9, 9, 49, 121), solver.solution(intArrayOf(-7, -3, 2, 3, 11)))
        assertArrayEquals(intArrayOf(1, 4, 9), solver.solution(intArrayOf(1, 2, 3)))
    }
}
