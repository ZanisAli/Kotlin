import java.util.*

//comparable concept is like sorting.

class Person(var name:String,var age:Int):Comparable<Person>
{

    override fun compareTo(other: Person): Int {//this will compare name and age of Person , mentioned above with name and age or other:Person
    return this.age-other.age
    }

}

fun main(args:Array<String>)
{
    var listofNames= ArrayList<Person>()
    listofNames.add(Person("Ali",32))
    listofNames.add(Person("Zanis",22))

    listofNames.add(Person("Khan",19))

    println("print before sort")
    for(person in listofNames)
    {
        println(person.name)
        println(person.age)
    }
    println("After sort")
    Collections.sort(listofNames)// for array can use Array.sort
    for (person in listofNames)
    {
        println(person.name)
        println(person.age )
    }


}