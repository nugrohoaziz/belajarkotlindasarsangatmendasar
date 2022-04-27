fun main() {
    val nilai = "D"
    val kecepatan = 10

    when(nilai){
        "A", "B" -> println("kamu lulus")
        else -> println("kamu ga lulus")
    }

    val kecepatanJalan = arrayOf(5,6,7,8)
    when(kecepatan){
        in kecepatanJalan -> println("kecepatan stabil")
        !in kecepatanJalan -> println("kecepan tidak stabil")
    }

    val dadu = 1..6
    val acakDadu = dadu.random()
    val luckyNumber = arrayOf(2,4,6)
    when(acakDadu){
        in luckyNumber -> println("you win you've got $acakDadu")
        !in luckyNumber -> println("you lose $acakDadu")
    }
}