fun main(args: Array<String>) {
    var nullExAny: Any? = null
    nullExAny = 11
    var  newValue = nullExAny / 2.5 //newValue имеет тип Double

    var helloString = "hello"
    var aplanaString = "aplana"
    println("${helloString + " " + aplanaString}")

    var five: Char = '5'
    println(five.toString())
    println(five.code.toByte())
    println(five.code.toShort())
    println(five.code)
    println(five.code.toDouble())
    println(five.code.toFloat())
    println(five.code.toLong())

    println("What is your name?")
    var userName: String? = readLine()
    print("Hello, ${userName.toString()}")

    var reverseAlphabet = 'z' downTo 'a'
}