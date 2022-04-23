fun main() {
    var namaawal: String = "aziz"
    var namatengah: String = "nugroho"
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
    var fullname: String = namaawal + " " + namatengah
    println(fullname)
}