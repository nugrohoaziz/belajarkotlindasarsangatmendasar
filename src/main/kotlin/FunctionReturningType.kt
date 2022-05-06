fun main() {
    val hasil = penjulahanUang(0,90,10)
    val buku = stringlist(namaBuku = "Kisah Sukses Aziz", namaPengarang = "Aziz")
    println("total jumlah pembelian makanan hari selasa adalah $hasil")
    println("semua manusia dibumi selama 90 tahun membeli $buku")
}


fun penjulahanUang (uangAziz: Int, uangHabib: Int, uangAdam: Int): Int{
    val perhitungan = uangAziz + uangHabib + uangAdam
    return perhitungan
}

fun stringlist(namaPengarang: String, namaBuku: String):String{
    val aaraayBook = "$namaPengarang, $namaBuku"
    return aaraayBook
}

