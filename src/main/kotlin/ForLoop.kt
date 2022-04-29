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

    //for loop campuran
    val ukuranArray = namaMahasiswa.size -1
    for (i in 0..ukuranArray){
        println("index $i = ${namaMahasiswa.get(i)}")
    }

    val namaSholat = "fajar"
    val isiRakaat = arrayOf(
        "Takbiratul Ihram",
        "Membaca Doa Iftitah",
        "Membaca Surat Al-Fatihah",
        "Membaca Surat Pendek",
        "Rukuk",
        "itidal",
        "sujud",
        "Duduk di Antara Dua Sujud")
    when(namaSholat){
        "fajar" -> {
            for (run in 1..2){
                println("${isiRakaat}")
            }
        }
        "zuhur" -> {
            for (run in 1..4){
                println(isiRakaat)
            }
        }
    }

    
}