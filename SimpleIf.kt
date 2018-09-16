

fun main(args: Array<String>)
{
    println("Enter your grade?")
    var grade = readLine()!!.toDouble()

    if(grade>=90) {
        println("You are in A level")
    }

        println("You entered your grade: $grade")

}