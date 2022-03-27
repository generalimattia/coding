package kata

import org.junit.Assert.*
import org.junit.Test

class RansomNoteTest {

    @Test
    fun `should not construct ransom note`() {
        assertFalse(RansomNote(ransomNote = "a", magazine = "b").canConstruct())
        assertFalse(RansomNote(ransomNote = "aaa", magazine = "abc").canConstruct())
    }

    @Test
    fun `should construct ransom note`() {
        assertTrue(RansomNote(ransomNote = "aabbccdd", magazine = "ddaabbcc").canConstruct())
    }
}