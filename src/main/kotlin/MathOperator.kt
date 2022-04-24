fun main() {
    val result1: Double = 8.3 / 3
    println(result1.toInt())

    val result2: Double = 10 + 78.0 / 4
    println(result2)

    val result3: Int = 10 + 78 / 4
    println(result3)
    println(result3.toDouble())

    //add up all prices
    var total = 0
    val barang1 = 100
    total = total + barang1
    val barang2 = 200
    total = total + barang2
    val barang3 = 300
    total = total + barang3
    println(total)

    //augmanted asigment
    var total2 = 0
    val phone1 = 100
    total2 += phone1
    val phone2 = 200
    total2 += phone2
    val phone3 = 300
    total2 += phone3
    println(total2)
}