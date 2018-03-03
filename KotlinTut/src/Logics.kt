fun main(args: Array<String>) {
    val x = 1
    when(x) {
        1-> println("x is poop")
        else -> println("x==$x")
    }

    fun vaderIsFeeling(mood: String = "angry") {
        if (mood=="angry") {
            println("Run for the hills, vader is $mood")
        } else {
            println("whatever you do, don't make him angry")
        }
        vaderIsFeeling()
    }


}