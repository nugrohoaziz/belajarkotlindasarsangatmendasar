fun main() {
    val range = 1..10

    //the rusult range 1-10
    println(range)

    //counting all range number
    println(range.count())

    //see have value in range?
    println(range.contains(10))
    println(range.contains(11))

    //see the first number of range
    println(range.first)

    //see the last number of range
    println(range.last)

    val range2 = 100 downTo 10 step 5

    //how to see step range work
    println(range.step)
    println(range2.step)
}
