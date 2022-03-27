package kata

/*
    Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
 */
class RansomNote(private val ransomNote: String, private val magazine: String) {
    fun canConstruct(): Boolean {
        val charMap: MutableMap<Char, Int> = mutableMapOf()

        magazine.forEach { char: Char ->
            charMap[char] = charMap[char]?.let { count: Int ->
                count + 1
            } ?: 1
        }

        ransomNote.forEach { char: Char ->
            if (!charMap.containsKey(char)) {
                return false
            }
            charMap[char] = charMap[char]!! - 1
            if (charMap[char]!! < 0) {
                return false
            }
        }
        return true
    }
}