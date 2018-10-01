import java.io.FileReader
import java.io.FileWriter

//to write a file to storage



fun main(args: Array<String>)
{

    println("1- to Read, 2- to Write")
    var op= readLine()!!.toInt()
    if(op==1) {
        ReadFromFile()

    }
    else {
        println("Enter any text: ")
        var s = readLine()!!.toString()
        WriteToFile(s) //by writing new file it will rewrite it.
    }
}

fun WriteToFile(str:String)
{
    ReadFromFile()
    try {
        var fo = FileWriter("text.txt",true) //open the file //if file not present it will create with this name, by writing true means that if have file don't create again , jsut append the data to it.
        fo.write(str+ "\n")//write the string to the file
        fo.close() //close the file
    }catch (ex:Exception)
    {
        println(ex.message )
    }
}

fun ReadFromFile()
{
    try {
        var fin=FileReader("text.txt")
        var c:Int?
        do {
            c=fin.read()
            print(c.toChar())
        }while (c!=-1)
    }catch (ex:Exception)
    {
        println(ex.message)
    }
}