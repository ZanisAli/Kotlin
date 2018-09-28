class UserAdmins<T>(credit:T){ //T is template and is generic, no need to type speicific data type,if user pass string to this class then T will be String
    init {
        println(credit)
    }
}

fun <T> display(process: T) //fun as generic, template
{
    println(process)
}

fun main(args: Array<String>)
{
    var useradmin= UserAdmins<String>("hussein") //string is passing so credit in T is string
    var useradmin2= UserAdmins<Int>(20) // here T is becoming int as Integer is going.

    display(34)
    display("zanis")
}