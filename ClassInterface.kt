interface op{   //method definitions are in interface and we can implement in any class, // interface by default is open,
    fun sum(n1:Int, n2:Int) {
        println("sum=" +n1+n2)}//if someone call these methods without implementing then this will use these default implementation.
    fun div(n1:Int, n2:Int) {
        println("sum=" +n1+n2)}
}

class UserOp:op{
    override fun sum(n1: Int, n2: Int) {
        println("Sum: "+ n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println("Sum: "+ n1/n2)
    }

}


class AdminOp:op{
    override fun sum(n1: Int, n2: Int) {
        println("Sum: "+ (n1+n2)*2)
    }

    override fun div(n1: Int, n2: Int) {
        println("Sum: "+ n1/n2/2)
    }

}

class ManagerOp:op{

}

fun main(args: Array<String>)
{

    var adminop= AdminOp()
    adminop.sum(10,20)

}