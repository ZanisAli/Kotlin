

import org.omg.CORBA.INTERNAL

fun main(args:Array<String>){


    //this is static array, will cover 5 memory location initially (drawback)
    var arrayInt= Array<Int>(5){0}  //this is array of size 5, type : integer and initial value is 0, so five locations, every location value is 0)

    //print all elements in array
    var index:Int=0
    for (element in arrayInt)
    {
        println("Value on index $index is : " + arrayInt[element])
        index++
    }


    //array of strings with user input will be saved

    var arrayStr =Array<String>(4){""} //initially empty
    for(index in 0..3)
    {
        println("Enter different name than entered before if entered")
        arrayStr[index] = readLine()!!
    }

    //for output of above string
    for(index in 0..3)
    {
        println("You entered: " + arrayStr[index])
    }
}