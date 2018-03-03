//class Car constructor(val make: String, val model: String) {
//    fun accelerate() {
//        println("vroom vroom")
//    }
//}
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//    fun tow() {
//        println("Taking the horses to the rodeo")
//    }
//}
open class Vehicle ( val make: String, val model: String) {

    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("Parking the vehicle")
    }

    fun stop() {
        println("STOP")
    }

}

class Car (make: String,model:String,var color:String): Vehicle(make,model) {
    override fun accelerate(){
        println("We are going ludicrous mode")
        super.accelerate()
    }
}

class Truck (make: String,model:String,val towingCapacity: Int): Vehicle(make,model) {
    fun tow() {
        println("Headed out to the mountains")
    }
}
fun main(args: Array<String>) {
    val car = Car("Toyota","Avalon","Blue")
    println(car.make)
    println(car.model)
    car.accelerate()

    val tesla = Car("Tesla","ModelS","Red")
    tesla.accelerate()


    val truck = Truck("Ford","F-150",10000)
    truck.tow()
}