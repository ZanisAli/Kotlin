

class Car( var type:String, var price: Double ,var milesDrive: Int){ //if write var keyword with it then in main class by typing object and dot it will give what variables or functions are available in this class otherwise not

    init { //init is the method that run automatically whenever class object initialize it ,
        println("Type: $type")
    }

    fun  getCarPrice():Double{
        return (this.price - (this.milesDrive.toDouble()*10))
    }
}

fun main(args: Array<String>){

    val huCar = Car("BMW",300.7,10) //object of class is created

    val zCar = Car("Mercedes",500.5,20) //second instance of class is created

    println("Price " + huCar.getCarPrice())
    //huCar.type //because wrote var with parameter

}