fun main(args:Array<String>){
//in kotlin semicolon doesn't matter, add it or not

    var n1:Int =10
    var n2:Int?
    var n2Str:String="12"
    //n2=n2Str //trying to add string to integer that is not allowed ofcours
    n2=n2Str.toInt()   // now allowed because we converted to integer and for other types likewise
    println("n1:"+n1)
    println("n2:"+n2)
    println("n1Str:"+n2Str)


}