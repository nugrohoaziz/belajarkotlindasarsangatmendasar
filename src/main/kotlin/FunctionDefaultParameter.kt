fun main() {
    hello("lkjdsgf")
}

fun hello(firstName:String, lastName:String = ""){
    if (lastName == ""){
        println("hellow $firstName")
    }else{
        println("hellow $firstName $lastName")
    }
}