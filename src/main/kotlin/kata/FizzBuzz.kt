package kata

class FizzBuzz {

    private val fizzBuzzMap: Map<Int, String> = linkedMapOf(
        3 to "Fizz",
        5 to "Buzz"
    )

    fun fizzBuzz(n: Int): List<String> =
        (1..n).map { value: Int ->
            fizzBuzzMap.asSequence()
                .filter { entry: Map.Entry<Int, String> -> value.canBeDividedBy(entry.key) }
                .map { it.value }
                .reduceOrNull { a: String, b: String -> a + b }
                .orElse(value.toString())
        }
}

private fun Int.canBeDividedBy(divisor: Int): Boolean = this % divisor == 0
fun <T> T?.orElse(default: T): T = this ?: default