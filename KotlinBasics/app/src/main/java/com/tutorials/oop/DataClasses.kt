package com.tutorials.oop

// -------------------------------Data Classes------------------------------------------------------

data class User(val id: Long, var name: String)

fun main() {
    val user1 = User(1, "Artur")

    user1.name = "Valentine"
    val user2 = User(1, "Valentine")

    println(user1 == user2)

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Artur Martynovych")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints Artur Martynovych

    val (id, name) = updatedUser
    println("id=$id name=$name")

}