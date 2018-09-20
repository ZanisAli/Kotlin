
var name:String="Zanis Ali"// now this is global variable and can be used anywhere in this program.

fun scope(a:String):Unit{


    println(name)

}

fun main(args: Array<String>){

   // var name="Zanis"// now this variable is local and its access is till main, can't be used outside

    scope("None")
}