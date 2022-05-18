fun main() {
    val namad: String = "kijang"
    val manggil: String = namad.hai()

    println("$manggil")
}

fun String.hai(): String = "heloow $this"