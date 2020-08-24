object HsbcPractice {

    /*
    Given an array of positive integers. All numbers occur even number of times except one number
    which occurs odd number of times. Write a function that returns the item that repeats odd number of times.
    Try for time complexity: O(n)
    */

    private val numbers = intArrayOf(1, 5, 5, 1, 1, 3, 3, 4, 2, 1, 2, 4, 2, 2, 2, 8, 8, 8)

    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello, World!")
        println(oddNumber())
    }

    private fun oddNumber(): String {
        val numbersHashMap: HashMap<Int, Int> = HashMap()
        val listOddNumbers: MutableList<Int> = mutableListOf()

        for (number in numbers) {
            if (numbersHashMap.containsKey(number)) {
                val repeatedTimes: Int = numbersHashMap[number] ?: 0
                numbersHashMap[number] = repeatedTimes + 1

                if ((repeatedTimes + 1) % 2 != 0) {
                    listOddNumbers.add(number)
                } else {
                    listOddNumbers.remove(number)
                }
            } else {
                numbersHashMap[number] = 1
            }
        }

        return listOddNumbers.toString()
    }
}