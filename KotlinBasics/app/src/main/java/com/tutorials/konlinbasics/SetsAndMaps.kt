package com.tutorials.konlinbasics

fun main() {

    val fruits = setOf("Orange", "Apple", "Grape", "Apple", "Mango", "Orange")
//    println(fruits.size)
//    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
//    println(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
//    println(daysOfTheWeek[2]) // [2] is a key

    for (key in daysOfTheWeek.keys) {
        println("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favourite" to Fruit("Grape", 2.5),
            "OK" to Fruit("Apple", 1.0))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    println(newDaysOfWeek.toSortedMap())

}

//data class Fruit(val name: String, val price: Double) is in Arrays.kt

