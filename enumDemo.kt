enum class Directions{
    NORTH, SOUTH, WEST, EAST   //so values of class can be from these four values from enum

}

fun main(args:Array<String>)
{

    var userDire=Directions.EAST
    if (userDire==Directions.EAST)
        {
            println("Person is going east")
            }
    else
    {
        print("person don't know where he is going")
    }

}