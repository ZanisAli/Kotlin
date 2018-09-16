
fun main(args: Array<String>)
{

    //hashmap is mapping keys to the values
    //key is unique, if you will put different values for same key then value of that key will be updated

    var map= HashMap<Int, String >()
    map.put(1,"Zanis")
    map.put(2,"Ali")
    map.put(3,"Khan")

    println(map.get(3))


    //print elements of all keys
    for(k in map.keys)//you will get all keys with keyword keys
    {
        println(map.get(k))
    }

}