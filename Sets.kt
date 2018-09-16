

fun main(args: Array<String>)
{
    //sets, in set element can't be repeated

    var seteleme= setOf(1,24,5,6,3,2,24) //here set will display only one time 24 as it is sets
    for(k in seteleme)
    {
        println(k)
    }
    //seteleme[3].ad //can't be done because set is also immutable

    //have to make also mutable as we did before

    var setel= mutableSetOf(1,3,4,5,63,34)
    setel.add(54)//now can add because it is now mutable

    for (l in setel)
    {
        println(l)
    }

}