package com.tutorials.oop

fun main() {

    val myCar = Car()
    println("Brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 240
    println("Maxspeed is ${myCar.maxSpeed}")

}


// ------------------------- Late init Plus Setters And Getters ------------------------------------

class Car() {
    lateinit var owner: String

    val myBrand: String = "Mercedes-Benz"
        // Custom getter
        get() {
            return field.lowercase()
        }

    var maxSpeed: Int = 250
        //        get() = field
        set(value) {
            field = if(value > 0) value else
                throw IllegalArgumentException("Maxspeed cannot be less than 0")
        }

    var myModel: String = "S500"
        private set


    init {
        this.myModel = "AMG"
        this.owner = "Valentine"
    }
}

// -------------------------------------------------------------------------------------------------