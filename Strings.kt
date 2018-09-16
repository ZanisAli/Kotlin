

fun main(args:Array<String>){

    var title= "My name is Zanis  "  //string

    println("Intro: " + title) //string concatenation like in PHP etc
    //or
    println("Intro: $title")

    //as string is array of characters so this means that we can read even on specific location of any string
    //let say you want to read what is on 2nd index of string "title"
    println("On third index of string is: " + title[3])  //on 3rd index is "n" of word "name "

    //change sting to lower or upper case

    println(title.toLowerCase())

    println(title.toUpperCase())

    //split string on the basis of given command

    println(title.split(" "))

    //trim
    println(title.trim()) //trim will remove any spaces before and after string

}