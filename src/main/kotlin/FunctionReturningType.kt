fun main() {
    val hasil = penjulahanUang(0,90,10)
    val buku = stringlist(namaBuku = "Kisah Sukses Aziz", namaPengarang = "Aziz")
    println("total jumlah pembelian makanan hari selasa adalah $hasil")
    println("semua manusia dibumi selama 90 tahun membeli $buku")

    val hasilPembagian = pembagian(8,2)
    println(hasilPembagian)
    arraarara()

    val hasilKelilingPersegi = hitungBalok(2,2)
    println("hasil keliling persegi $hasilKelilingPersegi")
    val hasilKelilingPersegiPanjang = hitungBalok(4,2)
    println("hasil keliling persegi panjang $hasilKelilingPersegiPanjang")
}


fun penjulahanUang (uangAziz: Int, uangHabib: Int, uangAdam: Int): Int{
    val perhitungan = uangAziz + uangHabib + uangAdam
    return perhitungan
}

fun stringlist(namaPengarang: String, namaBuku: String):String{
    val aaraayBook = "$namaPengarang, $namaBuku"
    return aaraayBook
}

fun pembagian(a:Int, b:Int): Int{
    if (b == 0){
        return 0
    }else{
        val result = a / b
        return result
    }
}
//ini adalah default parameter
fun arraarara(o:Int = 7, io:Int =9){
    val hisil = o + io
    println(hisil)
}

fun hitungBalok(p:Int, l:Int): Int{
    if (p == l){
        val perhitunganKelilingPersegi = 4 * p
        return perhitunganKelilingPersegi
    }else {
        val perhitunganKelilingPersegiPanjang = 2 * (p + l)
        return perhitunganKelilingPersegiPanjang
    }
}

