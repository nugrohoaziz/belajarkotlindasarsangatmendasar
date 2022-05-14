fun main() {
    val lupi = arrayOf("baeishihdf", "bvudhsfkljhd")
    val result = mencobaMengembalikanArray(lupi)
    println("${result.toList()}")

    val seribuPukulan = lufiSiBajakLaut(10,10,10,10)
    println("jurus seribu tonjokan $seribuPukulan")

}

fun mencobaMengembalikanArray(lapi: Array<String>): Array<String> {
    return lapi
}

fun lufiSiBajakLaut(vararg banyaks: Int): Int{
    var tangan = 1
    for (banyak in banyaks){
        tangan += banyak
    }
    return tangan
}

