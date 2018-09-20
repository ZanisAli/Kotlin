// Polymorphism means actually different forms, in here means same name of function, same number of parameters but different parameters data types

fun show(name: String){

    println("Name: " +name)
}

fun show(number: Int){

    println("Name: " +number)
}

fun main(args: Array<String>){

    show("Zanis")
    show(100)

}