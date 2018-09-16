fun main(args:Array<String>){
//in kotlin semicolon doesn't matter, add it or not

    var name:String? //adding question mark will save and will let null value also for this variable
    name="zanis"
    //or
    //name=null
    //if we want that program should throw exception and don't run if we don't have value then put "!!" like below
    print(name!!)
}