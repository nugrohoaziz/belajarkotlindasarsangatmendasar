fun main() {
    val hasil = penjulahanUang(0,90,10)
    println("total jumlah pembelian makanan hari selasa adalah $hasil")
}


fun penjulahanUang (uangAziz: Int, uangHabib: Int, uangAdam: Int): Int{
    val perhitungan = uangAziz + uangHabib + uangAdam
    return perhitungan
}

