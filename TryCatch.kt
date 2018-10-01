

fun main(args: Array<String>)
{
    try {

        println("Enter the number:")
        var n2:Int= readLine()!!.toInt()
        var Div= 100/n2
        println("Div = $Div")
    }catch (ex:Exception){
        println(ex.message)
    }
}