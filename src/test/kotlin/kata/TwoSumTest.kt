package kata

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class TwoSumTest {

    @Test
    fun `should find two sum indices`() {
        val input = intArrayOf(2, 7, 11, 15)
        val expected = intArrayOf(0, 1)
        val result: IntArray = TwoSum(input).twoSum(9)
        assertEquals(expected.size, result.size)
        for (i in expected.indices) {
            assertTrue(result.contains(expected[i]))
        }
    }
}