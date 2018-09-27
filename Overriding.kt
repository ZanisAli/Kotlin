open class Operations1(){   //open means now it can be inherited
    var ProcessName:String?=null //default var is public, it can be accessed in down class as that super class is inheriting this class
    //if put protected then it is accessible in class who inherited this class but not in main or anywhere else
    // if private then only this class will use, not even who inherited this class
    open fun sum(n1: Int, n2:Int):Int{ //open to make if public so that in class we are going to inherit want to modify this function a bit
        return  n1+n2
    }

    fun div(n1: Int, n2:Int):Int{
        return  n1/n2
    }
}


class MultiOperations1():Operations1(){ //here add and div is inherited from Operations as called in main using MultiOperations object, have to add "open" with keyword form which we are inheriting


    var test:Int?=null

    override fun sum(n1: Int, n2:Int):Int{ //open to make if public so that in class we are going to inherit want to modify this function a bit
        return  n1+n2*3
        //this.sub()
       // super.sum(n1, n2)//super is calling sum of class from where we inherited
    }
    fun sub(n1: Int, n2:Int):Int{
        this.test=10//this means this class
        return  n1-n2
    }


    //if want to call function from this class again here then use this


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
    var op= Operations1()
    var sum= op.sum(10,20)
    println("Sum ="+ sum)
    var div= op.div(20,10)
    println("Division ="+div)

    //second class
    var op2= MultiOperations1() as Operations //now MultiOperations1 are casted as Operations1, means now with op2, not 4 but those 2 functons will be avilable who are in Operations1
    sum= op2.sum(10,30) //sum is already defined above as variable
    println("sum ="+sum)
    div= op2.div(30,10)
    println("Division ="+div)
   // var mul= op2.mul(10,10)
    //println("Multiplication ="+mul)
    //var sub= op2.sub(30,10)
    //println("Subtraction ="+sub)


    op.ProcessName //here also is accessible because it is public
}