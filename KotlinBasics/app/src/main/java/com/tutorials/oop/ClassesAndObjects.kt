package com.tutorials.oop


fun main() {

    val artur = Person("Artur", "Martynovych", 19)
    artur.hobby = "programming"
    artur.stateHobby()
    println("Artur is ${artur.age} years old")

    val john = Person()
    john.hobby = "wrestling"
    john.stateHobby()

}


// -----------------------Classes and Objects----------------------------------------
class Person (firstName: String = "John", lastName: String = "Cena") {
    // Member Variables - Properties
    var age: Int? = null
    var hobby: String = "watch Netflix"
    private var firstName: String? = null

    // Initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
        println("Initialized a new Person object with " +
                "firstName = $firstName, lastName = $lastName and age = $age")
    }

    // Member functions - Methods
    fun stateHobby() {
        println("$firstName\'s hobby is $hobby")
    }

}


// -------------------------------------------------------------------------------------------------
