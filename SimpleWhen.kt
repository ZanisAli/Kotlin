

fun main(args: Array<String>)
{
    var x=4

    when(x)
    {
        //when value of x is 1 (when is like switch in C++)
        1-> {
            println("Value of x  is 1")
        }
        2,3->{
            println("Value of x  is 2 or 3")
        }
        in 4..6 ->  //NOT MORE THAN 2 DOTS
        {
            println("Value is between 4 and 6")
        }
        else -> {
            println("Value of x is other than 1 and 2")
        }
    }
}