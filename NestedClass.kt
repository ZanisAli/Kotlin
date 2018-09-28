
class Outer(){
    private val name:String?=null

    /*inner*/ class Nested{   //inner is to tell that it is inner or nested now it will acces variables of outer class, otherwise not

        fun Show(){
            print("nested")
        }
    }
}

fun main(args: Array<String>)
{
    var out=Outer()
    var nested= Outer.Nested()//getting instance of nested class
    nested.Show()
}