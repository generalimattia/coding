package kata

/*
    Given a roman numeral, convert it to an integer.
 */
class RomanToInt {

    private val romanToIntMap: Map<String, Int> =
        mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000,
            "IV" to 4,
            "IX" to 9,
            "XL" to 40,
            "XC" to 90,
            "CD" to 400,
            "CM" to 900
        )

    fun parse(roman: String): Int {
        var sum = 0
        var lastChar = ""

        for (i in roman.lastIndex downTo 0) {
            val currentChar: String = roman[i].toString()
            val romanNumber = "$currentChar$lastChar"

            val currentValue: Int = romanToIntMap[romanNumber]?.let { value: Int ->
                value - romanToIntMap[lastChar].orZero()
            } ?: romanToIntMap[currentChar].orZero()

            lastChar = currentChar
            sum += currentValue
        }
        return sum
    }
}

private fun Int?.orZero(): Int = this ?: 0