package kata

/*
    Given an array of integers and an integer target,
    return indices of the two numbers such that they add up to target.
 */
class TwoSum(private val array : IntArray) {

    fun twoSum(target: Int): IntArray {

        val diffMap = mutableMapOf<Int, Int>()

        for (i in array.indices) {
            val diff: Int = target - array[i]
            if(diffMap[diff] != null) {
                return intArrayOf(i, diffMap[diff]!!)
            } else {
                diffMap[array[i]] = i
            }
        }
        return intArrayOf()
    }
}