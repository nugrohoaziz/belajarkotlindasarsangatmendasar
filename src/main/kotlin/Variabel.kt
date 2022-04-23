const val APLICATION = "belajar kotlin dasar"
const val VERSION = "00.1.1.1."

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

    println("nama aplikasi $APLICATION versi ke $VERSION")
}