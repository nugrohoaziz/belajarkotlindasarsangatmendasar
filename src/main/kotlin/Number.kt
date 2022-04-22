fun main() {
    val age: Byte = 30
    val heig: Int = 170
    val distance: Short = 2000
    val balance: Long = 100000000L

    println(age)
    println(heig)
    println(distance)
    println(balance)

    //floating point
    val floatnum: Float = 12.3F
    val doubblnum: Double = 123.980

    println(floatnum)
    println(doubblnum)

    //undersocore number
    val age2: Byte = 30
    val heig2: Int = 170
    val distance2: Short = 2_000
    var balance2: Long = 100_000_000L

    println(age2)
    println(heig2)
    println(distance2)
    println(balance2)

    var balance3Int: Int = balance2.toInt()
    println(balance3Int)

    val doublenum2: Int = doubblnum.toInt()
    println(doublenum2)

}