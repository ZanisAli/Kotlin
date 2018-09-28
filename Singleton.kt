
//static is not in kotlin , instead can use singleton design pattern
//singleton only allow to create one object from the class, first need to put private  as constructor so nobody can create direct instance from this calss
class Singleton{
    var name:String?=null
    private constructor()
    {
        println("Instance is created")
    }
    //second step is to add companion object
    companion object {
        val instance:Singleton by lazy{Singleton()}
    }
}

fun main(args: Array<String>)
{
    //overall only one instance is created
    var obj1= Singleton.instance
    obj1.name   ="zanis"
    println(obj1.name)

    var obj2= Singleton.instance //when second instance will try to make, singleton in companion instanc will return previous one, as it have previous one.
    println(obj2.name)
} 