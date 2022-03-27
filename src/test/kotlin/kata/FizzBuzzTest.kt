package kata

import org.junit.Assert.*
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun `should map values to fizz buzz`() {
        val expected3 = listOf("1", "2", "Fizz")
        assertEquals(expected3, FizzBuzz().fizzBuzz(3))

        val expected5 = listOf("1", "2", "Fizz", "4", "Buzz")
        assertEquals(expected5, FizzBuzz().fizzBuzz(5))

        val expected15 = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
        assertEquals(expected15, FizzBuzz().fizzBuzz(15))
    }
}