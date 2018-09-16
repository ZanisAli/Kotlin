

fun main(args: Array<String>)
{
    //same as hash map but using builtin datastruck hashmap of

    var map= hashMapOf(1 to "Zanis", 2 to "Ali", 3 to "Khan")

    map.put(4 ,"Lisa")

    println(map.get(3))
    //or
    println(map[3])

    //same thing which we did with hashmap can be done for array of

    var ar= arrayOf(1,2,3,4,5)
    print(ar[2])

    //same for list, list is linked list, you can't do like ls[2]=32
    //value of list once defined then you can't change it. it is immutable, importatn
    var ls= listOf(1,2,3,4,5)
    for (k in ls)
    {
        println(k)
    }

    //if you want to change the elements of list(link list) then you have to define like this

    var lss= mutableListOf(1,4,5,6)
    lss[1]=7
    for(l in lss)
    {
        println(l)
    }
}