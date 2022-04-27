fun main() {
    val namaMahasiswa = arrayOf("eko", "hurin", "risma", "vina")
    for (mahasiswa in namaMahasiswa){
        println(mahasiswa)
    }

    //for loop range
    var putran = 0
    for(hulahup in 1..8){
        println("$hulahup putaran ke ${putran++}")
    }

}