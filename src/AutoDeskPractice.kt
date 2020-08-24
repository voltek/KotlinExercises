import java.util.stream.Collectors

object AutoDeskPractice {

    @JvmStatic
    fun main(args: Array<String>) {
        println(replaceQuotesV2())
    }

    private fun replaceQuotesV2(): String {
        val originalText = "Hey, \"this is awesome\", we support \"quoted\" strings!"
        val replaceText = "\"Replaced\""

        val splittedText = originalText.split("\"").toMutableList()

        for (indice in splittedText.indices) {
            if (indice != 0 && indice % 2 != 0) {
                splittedText[indice] = replaceText
            }
        }

        return splittedText.joinToString("")
    }
}