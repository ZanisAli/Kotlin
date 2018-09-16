

fun main(args: Array<String>)
{
    println("Enter your grade?")
    var grade = readLine()!!.toDouble()

    if(grade>=90) {
        println("You are in A level")
    }
    else if(grade>=80 && grade<90)
    {
        println("You are in B level")
    }
    else{
        println("You entered your grade: $grade and you are not in A level")
    }
}