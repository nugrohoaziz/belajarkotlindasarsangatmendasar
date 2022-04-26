import jdk.incubator.vector.VectorOperators.Binary

fun main() {
    val kecepatanMinimal = 5
    val kecepatanMaximal = 10
    val warningCode = "w"
    val kecepatanStabil = 5..10
    val hasilKecepan = kecepatanStabil.random()
    var kecepatanJalan = 2
    //if(kecepatanJalan >= kecepatanMinimal && kecepatanJalan <= kecepatanMaximal ){
       //println("kecepatan stabil")
    //} else {
        //when(warningCode){
            //"w" -> {
                //kecepatanJalan = hasilKecepan
                //println("Kecepan berubah menjadi stabil yaitu $kecepatanJalan")
            //}
            //"x" -> println("kecepatan tidak stabil")
        //}
    //}

    when{
        kecepatanJalan >= kecepatanMinimal && kecepatanJalan <= kecepatanMaximal -> {
            println("kecpatan stabil")
        } else -> {
            kecepatanJalan = hasilKecepan
            println("kecepatan stabil yaitu $kecepatanJalan")
        }
    }

    val beratManusia = arrayOf(29, 38, 47, 56)
    val tinggiManusia = arrayOf(30,40,50,60)
    if (tinggiManusia[0] <= 30 && beratManusia[0] < tinggiManusia[0]){
        println("manusia ideal")
    }



}