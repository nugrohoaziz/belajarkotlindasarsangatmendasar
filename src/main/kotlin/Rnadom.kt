fun main() {
    val allnumber = listOf(1,2,3,4,5,6,7,8,9,10)

    val even = mutableListOf<Int>()
    val od = mutableListOf<Int>()

    for (item in 1..allnumber.size){
        if (item % 2 == 0){
            even.add(item)
        }else{
            od.add(item)
        }
    }

    println("genap : $even")
    println("ganjil: $od")
}