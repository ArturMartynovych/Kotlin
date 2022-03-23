package com.tutorials.oop

fun main() {
    val samsS20 = MobilePhone("Android", "Samsung", "Galaxy S22 Ultra", 60)
    samsS20.chargeBattery(23)
}


class MobilePhone (osName: String, brand: String, model: String) {

    private var battery: Int = 0

    constructor(osName: String, brand: String, model: String, battery: Int) : this(osName, brand, model) {
        this.battery = battery
    }

    fun chargeBattery(percent: Int) {
        println("Battery was $battery%")
        battery += percent
        if (battery >= 100) {
            battery = 100
        }
        println("And now it is $battery%")
    }

    init {
        println("Your phone is $brand $model. The OS in this phone is $osName.")
    }

}