fun main() {
    var car = Car("Prado", "svu", "red", 10)
    car.carry(54)
    car.identity()
    car.calculateParkingFees(4)

    var markx = Bus("NISSAN", "XYZ", "red",35)
    markx.maxTripCar(500.35)
    markx.calculateParkingFees(5)

}
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("carry $people passengers")
        } else {
            println("Overcarrying by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
            var parkingFees = 20
            var total1=parkingFees * hours
            println(total1)
            return total1
    }
}
class Bus(model:String, make:String, color:String, capacity:Int):Car(model,make,color,capacity){
    fun maxTripCar(fare: Double): Double {
        var totalAmount =fare*capacity
        println(totalAmount)
        return totalAmount
    }

    override fun calculateParkingFees(hours: Int): Int {
        var product = hours * capacity
        println(product)
        return product
    }
}
