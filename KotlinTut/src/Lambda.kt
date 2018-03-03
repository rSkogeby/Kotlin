fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message)}
    printMessage("Hello World!")
    val sumA = {x: Int,y:Int -> x + y}
    println(sumA(5,3))
    val sumB: (Int,Int) -> Int = {x,y -> x+y}
    println(sumB(3,8))
    // Reutnr void (unit)
    fun downloadData(url: String, completion: ()->Unit) {
        // Sent a download request
        // We got back data
        // there we no network errors
        println("First this")
        completion()
        println("Then this")

    }
    // Call downloadDataFunction
    downloadData("fakeURL.com",{
        println("The code in this block will only run" +
        " after the completion()")
    })

    fun downloadCarData(url:String, completion: (Car) -> Unit) {
        //Send a download request
        // We got back car data
        val car = Car("Tesla","ModelX","Blue")
        completion(car)
    }
    downloadCarData("fakeUrl.com") { car ->
        println(car.color)
        println(car.make)
    }
    downloadCarData("fakeUrl.com") {
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        // make the web request
        // we get the results back
        val webRequestSuccess = true
        if (webRequestSuccess) {
            //Received truck data
            val truck = Truck("Ford","F-150",10000)
            completion(truck,true)
        } else {
            completion(null,false)
        }
    }

    downloadTruckData("fakeURL.com") { truck, success ->
        if (success) {
            //do something with our truck
            truck?.tow()
        } else {
            // handle web request failure
            println("Something went wrong")
        }
    }
}