fun main() {
    // learn array
    val namaAnggota: Array<String> = arrayOf("budi", "agus", "nugroho")
    val umurAnggota: Array<Int> = arrayOf(10,60,30)

    //how to know, how much data in array "namaAnggota"
    println(namaAnggota.size)

    //how to get data at namaAnggota with index array
    println(namaAnggota.get(0))
    println(namaAnggota.get(1))
    println(namaAnggota.get(2))

    //how to change value
    umurAnggota.set(0, 30)
    //index 0 at array umurAnggota is 10 change to 30
    println(umurAnggota.get(0))
}