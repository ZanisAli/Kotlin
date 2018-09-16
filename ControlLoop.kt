import org.omg.CORBA.INTERNAL

fun main(args:Array<String>){


   //var count:Int =0

    for(count in 0..8)
    {
        if(count==5)
        {
            break //when value of count will be 5 it will break and will go out of loop
        }
        println("Value of count is : $count")
    }


    for(count in 0..8)
    {
        if(count==5)
        {
            continue // when value of count will be 5 , it will not execute loop after this and will go back to next value of loop
        }
        println("Value of count is : $count")
    }



}