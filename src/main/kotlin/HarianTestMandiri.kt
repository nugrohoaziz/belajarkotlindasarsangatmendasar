import jdk.incubator.vector.VectorOperators.Binary

fun main() {
    val kecepatanMinimal = 5
    val kecepatanMaximal = 10
    val warningCode = true
    val kecepatanStabil = 5..10
    val hasilKecepan = kecepatanStabil.random()
    var kecepatanJalan = 2
    if(kecepatanJalan >= kecepatanMinimal && kecepatanJalan <= kecepatanMaximal ){
       println("kecepatan stabil")
    } else {
        if (warningCode){
            kecepatanJalan = hasilKecepan
            println("kecepatan menjadi stabil yaitu ${kecepatanJalan}")
        }
    }



}