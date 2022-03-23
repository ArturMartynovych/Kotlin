package com.tutorials.oop


interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("The drivable is breaking")
    }
}


open class NewCar(override val maxSpeed: Double, val name: String, val brand: String) : Drivable {
    open var range: Double = 0.0

    fun extendRange(amount: Double) {
        if (amount > 0)
            range += amount
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }

    open fun drive(distance: Double) {
        println("$brand $name Drove for $distance KM")
    }

}

class ElectricCar(maxSpeed: Double, name: String, brand: String, batteryLife: Double)
    : NewCar(maxSpeed, name, brand) {
    override var range = batteryLife * 6

    override fun drive(distance: Double) {
        println("$brand $name Drove for $distance KM on electricity")
    }
    override fun drive(): String {
        return "$brand $name Would drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("Brake inside electric car")
    }

}

fun main() {
    val audiA3 = NewCar(250.0,"A3", "Audi")
    val teslaS = ElectricCar(220.0,"S-Model", "Tesla", 85.0)

//    teslaS.extendRange(200.00)
//    teslaS.drive()

    teslaS.brake()
    audiA3.brake()

    // Polymorphism
//    audiA3.drive(200.0)
//    teslaS.drive(200.00)
}