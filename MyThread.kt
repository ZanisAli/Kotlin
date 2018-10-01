

fun main(args:Array<String>)
{
   var t1= thread("thread 1")
    t1.start()

    var t2= thread("thread 2")
    t2.start()
    t2.join() //by join means next line will not run until t2 is finished
    println("check what is happening")//above and this line will work at the same time , why because that is why it is called as multithreading
}

class thread():Thread(){

    var ThreadName:String=""
    constructor(ThreadName:String):this(){
        this.ThreadName=ThreadName
        println("${this.ThreadName} is started")
    }
    override fun run() {
        //write thread

        var count=0
        while (count<10) {
            println("${this.ThreadName }Count: " + count)
            count++

            try {
                Thread.sleep(1000)// sleep this thread for 1 second
            }catch (ex:Exception)
            {
                println(ex.message)
            }
        }
    }
}