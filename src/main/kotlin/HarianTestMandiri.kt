import jdk.incubator.vector.VectorOperators.Binary

fun main() {
    val kecepatanMinimal = 5
    val kecepatanMaximal = 10
    val warningCode = "w"
    val kecepatanStabil = 5..10
    val hasilKecepan = kecepatanStabil.random()
    var kecepatanJalan = 2
    if(kecepatanJalan >= kecepatanMinimal && kecepatanJalan <= kecepatanMaximal ){
       println("kecepatan stabil")
    } else {
        when(warningCode){
            "w" -> {
                kecepatanJalan = hasilKecepan
                println("Kecepan berubah menjadi stabil yaitu $kecepatanJalan")
            }
            "x" -> println("kecepatan tidak stabil")
        }
    }



}