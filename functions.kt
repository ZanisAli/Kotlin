

//syntacx of creating function in kotlin
//third Double after colon is return type of function
fun sum(n1:Double, n2:Double):Double{

    var sum:Double=n1+n2
    return sum
}

//function with no return value/type
fun display(n:Int=0): Unit{ //if will not send anything while calling function then it will take default as 0 otherwise the sent value
    println("Number is: $n")
}

fun main(args: Array<String>){

    var r = sum(15.0,15.0)
    println("Sum of given numbers are: " +r)

    display(4)



}