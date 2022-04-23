fun main() {
    var namaAwal: String = "aziz"
    var namaTengah: String = "nugroho"
    var bio: String = """ 
saya adalah aziz
aziz adalaha saya
siapa saya?
        """
    println(bio)

    //menggunakan pipe yaitu "|"
    var alamat: String ="""
        |b
        |Cilegon
        |no where
    """.trimMargin()
    println(alamat)

    //menggunakan character yaitu ">"
    var lahir: String = """
        >univers 2.0
        >mars
        >lintang 45
    """.trimMargin(">")

    //menggabungkan dua string
    var fullName: String = namaAwal + " " + namaTengah
    println(fullName)

    //String tamplate
    var fullName2: String = "$namaAwal $namaTengah"
    println(fullName2)

    //String buat mengetahui banyak huruf dari string di fullName2
    var banyakHuruf: String = "nama : $fullName2 ada ${fullName2.length} huruf"
    println(banyakHuruf)
}