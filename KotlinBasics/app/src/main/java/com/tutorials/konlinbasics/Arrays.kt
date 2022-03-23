package com.tutorials.konlinbasics

fun main() {

//    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
//    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
//    println(numbers.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    for (fruit in fruits) {
        println(fruit.name)
    }

    for (i in fruits.indices) {
        print("${fruits[i].name} is in $i ")
    }

}

data class Fruit(val name: String, val price: Double)

