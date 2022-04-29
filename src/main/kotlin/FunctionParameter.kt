fun main() {
    sayHello("Hurin", "Vina")
    sayName("aziz", null)
    sayName("Hurin'in", "Firdaus")
}

fun sayHello(teman1: String, teman2: String){
    println("hello $teman1 $teman2")
}

fun sayName(firstName:String, lastName:String?){
    if (lastName == null){
        println("hallow $firstName")
    }else{
        println("hellow $firstName $lastName")
    }
}