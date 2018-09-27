open class Operations(){   //open means now it can be inherited
    var ProcessName:String?=null //default var is public, it can be accessed in down class as that super class is inheriting this class
    //if put protected then it is accessible in class who inherited this class but not in main or anywhere else
    // if private then only this class will use, not even who inherited this class
    fun sum(n1: Int, n2:Int):Int{
        return  n1+n2
    }

    fun div(n1: Int, n2:Int):Int{
        return  n1/n2
    }
}


class MultiOperations():Operations(){ //here add and div is inherited from Operations as called in main using MultiOperations object, have to add "open" with keyword form which we are inheriting

   fun sub(n1: Int, n2:Int):Int{
        return  n1-n2
    }

    fun mul(n1: Int, n2:Int):Int{
        return  n1*n2
    }

    fun GetName()
    {
        super.ProcessName // this is accessible because this variable is public by default in subClass
    }
}

fun main(args: Array<String>)
{
     var op= Operations()
     var sum= op.sum(10,20)
    println("Sum ="+ sum)
     var div= op.div(20,10)
    println("Division ="+div)

    //second class
    var op2= MultiOperations()
    sum= op2.sum(10,30) //sum is already defined above as variable
    println("sum ="+sum)
    div= op2.div(30,10)
    println("Division ="+div)
    var mul= op2.mul(10,10)
    println("Multiplication ="+mul)
    var sub= op2.sub(30,10)
    println("Subtraction ="+sub)


    op.ProcessName //here also is accessible because it is public
}