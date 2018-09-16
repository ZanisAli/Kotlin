

import org.omg.CORBA.INTERNAL

fun main(args:Array<String>){


    //arraylist is like list in python, or dynamic array, you can add as much as you can
    var arraylist = ArrayList<String>()
    arraylist.add("Zanis")
    arraylist.add("Ali")
    arraylist.add("Khan")

    //printing value in arraylist at specific index
    println("Element on index 1 is : " + arraylist[1])

    println("Element on index 1 is : " + arraylist.get(1))

    //getting all elements in array list

    for(item in arraylist)
    {
        println(item)
    }

    //search in arraylist

    if(arraylist.contains("Ali")) //case sensitive
    {
        println("Name is found")
    }
    else
    {
        println("Name is not found")
    }

    //print all elements by index

    for(index in 0..arraylist.size-1)
    {
        println("Element on index $index is  ${arraylist.get(index)}")
    }

}