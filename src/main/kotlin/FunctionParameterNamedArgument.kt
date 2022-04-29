fun main() {
    alamatKerja(negara = "german", rt = 8, kota = "swedem")
}

fun alamatKerja(negara:String = "", kota:String = "", rt:Int? = null){
    println("saya kerrja di $negara $kota $rt")
}