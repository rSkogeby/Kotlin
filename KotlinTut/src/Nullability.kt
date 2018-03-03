fun main(args: Array<String>) {
    var name : String = "JonnyB"
    var nullableName : String? = "Do I really exist?"
    nullableName = null
    // Null check
    var length = 0
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val l = if (nullableName!=null) nullableName.length else -1

    //Safe call operator?

    println(nullableName?.length)

    // Elvis operator
    val len = nullableName?.length ?: -1
    println(len)

    // !! operator: use only when you know 100% the value is there
    //println(nullableName!!.length)




}