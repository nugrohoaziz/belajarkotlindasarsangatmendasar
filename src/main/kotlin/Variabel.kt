fun main() {
    //imutable
    val namaAwal: String = "Aziz"

    //mutabel
    var namaFull = "Aziz"
    namaFull = "Aziz agus nugroh"
    println(namaFull)

    //nullable
    val firstName: String? = null
    println(firstName?.length)
}