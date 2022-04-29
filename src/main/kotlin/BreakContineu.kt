fun main() {
    //break
    var i = 0
    while (true){
        println("println while ke $i")
        i++
        if (i > 10){
            break
        }
    }
    //continue
    val jarak = 111..222
    for (j in jarak){
        if (j % 4 == 0){
            continue
        }
        println("ini adalah jarak ke $j")
    }

}