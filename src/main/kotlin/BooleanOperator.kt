fun main() {
    val finalTest = 80
    val attenden = 75
    val ekstranilai = 30


    val passFinalTes = finalTest >= 60
    val passAttenden = attenden >= 75
    val passEkstraNiliai = ekstranilai >= 60

    val pas = passFinalTes && passAttenden || passEkstraNiliai
    //nilai passEktraNilai sepetri opsional
    println(pas)
}