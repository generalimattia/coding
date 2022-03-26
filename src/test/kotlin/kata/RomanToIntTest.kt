package kata

import org.junit.Assert.*
import org.junit.Test

class RomanToIntTest {

    private val subjectUnderTest: RomanToInt = RomanToInt()

    @Test
    fun `should parse roman numbers as int`() {
        assertEquals(3, subjectUnderTest.parse("III"))
        assertEquals(58, subjectUnderTest.parse("LVIII"))
        assertEquals(1994, subjectUnderTest.parse("MCMXCIV"))
    }
}