fun main(args: Array<String>) {
    val str3 = "May the force\b be with you"
    val str4 = "May the force$str3 be with you"
    println(str4)
    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far away...
        |BUMM BUMM BUMMMM""".trimMargin()
    println(rawCrawl)

//    for (char in str4) {
//        println(char)
//    }

    val contentEquals = str4.contentEquals("May the firc b wiv u")
    println(contentEquals)

    val contains = str4.contains("force",true)
    println(contains)

    val uppercase = str4.toUpperCase()
    val lowercase = str4.toLowerCase()

    println(uppercase)
    println(lowercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str4.subSequence(4,13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightsabercolor = "green"
    val vehicle = "landspeeder"

    println("$luke has a $lightsabercolor lightsaber and drives a $vehicle")
    println("Lukes full name $luke has ${luke.length} characters")

}