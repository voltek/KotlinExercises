object Test {


    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        println("Hello, World!")

        //println(camelCasefy("TCP/IP is iNtEReStiNg"))

        println(getNote(13))
    }


    fun getNote(wantedNote: Int): String {

        var notesList = listOf("Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si")

        var correctNote: String = ""

        if (wantedNote in 0..127) {
            if (wantedNote < 12) {
                correctNote = notesList[wantedNote]
            } else {
                when {
                    wantedNote % 12 == 0 -> {
                        correctNote = notesList[0]
                    }
                    wantedNote % 13 == 0 -> {
                        correctNote = notesList[1]
                    }
                    wantedNote % 14 == 0 -> {
                        correctNote = notesList[2]
                    }
                    wantedNote % 15 == 0 -> {
                        correctNote = notesList[3]
                    }
                    wantedNote % 16 == 0 -> {
                        correctNote = notesList[4]
                    }
                    wantedNote % 17 == 0 -> {
                        correctNote = notesList[5]
                    }
                    wantedNote % 18 == 0 -> {
                        correctNote = notesList[6]
                    }
                    wantedNote % 19 == 0 -> {
                        correctNote = notesList[7]
                    }
                    wantedNote % 20 == 0 -> {
                        correctNote = notesList[8]
                    }
                    wantedNote % 21 == 0 -> {
                        correctNote = notesList[9]
                    }
                    wantedNote % 22 == 0 -> {
                        correctNote = notesList[10]
                    }
                    wantedNote % 23 == 0 -> {
                        correctNote = notesList[11]
                    }
                }
            }
        }

        return correctNote
    }

    fun camelCasefy(stringToCameCasefy: String): String {
        var camelString = ""
        var lastKnowLetterIndice = 0
        var firstLetterIndice = 0


        for (x in stringToCameCasefy.indices) {
            if (Character.isLetter(stringToCameCasefy[x])) {
                lastKnowLetterIndice = x


                if (x != 0 && firstLetterIndice == 0) {
                    firstLetterIndice = x
                }
                continue
            } else {
                var word = stringToCameCasefy.substring(firstLetterIndice, x)

                word.decapitalize()
                word.toUpperCase()
                camelString.plus(word)
                firstLetterIndice = 0
            }
        }

        return camelString
    }


    class SongData(val arrows: List<Arrow>) {

        private constructor(builder: Builder) : this(builder.arrows)

        class Builder {
            var arrows: MutableList<Arrow> = mutableListOf()
                private set

            fun addArrow(arrow: Arrow) = apply { this.arrows.add(arrow) }

            fun build() = SongData(this)
        }

        private fun drawArrow(timeStamp: Int) {

        }
    }

    class Arrow(direction: String) {


    }

    fun simpleArraySum(ar: Array<Int>): Int {
        var totalSum = 0
        for(number in ar) {
            totalSum += number
        }
        return totalSum
    }

}