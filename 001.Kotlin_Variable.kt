/* Two types : 1. var 2. val*/
fun main(args : Array<String>) {
    var a = "Hey" /* can change */
    val b = "Kotlin" /* can't change */

    a = "Hello" /* a will be Hello here */

    /* but we cannot change b, because it is val,
       if we want to change it'll show 
       error: val cannot be reassigned */
    println(a + " " + b)
}