//abstract class is from where no one can create instance/object, maybe for security reason

abstract class Credit() {
    fun CreditID():String {
        return "Secret code"
    }

    abstract fun newCredit() //this fun is now abstract, and the one who will inherit this will have to implement also, it will be alredy open by default
}

class UserInfo():Credit(){ //by inheriting abstract class we can access and use it in main even
    fun getInfor():String{
        return CreditID()
    }
    override fun newCredit()  //by implementing functions which is abstract, has to write override with it also
    {
        println("New card created")
    }
}

fun main(args:Array<String>)
{
    //var obj=Credit() it is abstract so no one can create an instance
    //println(obj.CreditID())

    var user=UserInfo()
    println(user.getInfor())
}