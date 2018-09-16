
fun main(args:Array<String>){
//in kotlin semicolon doesn't matter, add it or not

    print("Enter your name: ")
    var  name = readLine() //to read input from console
    print("Enter your age: ")
    var age:Int= readLine()!!.toInt()  //imp it will convert it to int but !! means that it is expecting input

    //for reading string, only readline() is enough but for int, double, float, etc need to convert and put "!!"

    println(name)
    print(age)
}