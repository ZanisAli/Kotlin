

class Car(){ //if write var keyword with it then in main class by typing object and dot it will give what variables or functions are available in this class otherwise not

    var type:String?=null
    var  price: Double?=null
    var milesDrive: Int?=null
    constructor(  type:String,  price: Double , milesDrive: Int):this()//this Car(constructor) should be called because that was super
    {
        this.type=type
        this.price=price
        this.milesDrive=milesDrive
    }

    //even can have more than one constructor

    constructor(type: String):this()
    {
        this.type=type
        println("constructor 2")
    }

/*
    init { //init is the method that run automatically whenever class object initialize it ,
        println("Type: $type")
    }
*/
    fun  getCarPrice():Double{
        return (this.price!! - (this.milesDrive!!.toDouble()*10))
    }
}

fun main(args: Array<String>){

    val huCar = Car("BMW",300.7,10) //object of class is created

    val zCar = Car("Mercedes",500.5,20) //second instance of class is created

    println("Price " + huCar.getCarPrice())
    //huCar.type //because wrote var with parameter

    //to check constructor with one parameter
    var non= Car("Zanis")

}