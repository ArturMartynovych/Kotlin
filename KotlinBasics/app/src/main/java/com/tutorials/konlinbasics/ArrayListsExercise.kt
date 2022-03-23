package com.tutorials.konlinbasics

fun main() {

    val fiveNumbs = arrayListOf<Double>()
    fiveNumbs.add(4.1)
    fiveNumbs.add(3.114)
    fiveNumbs.add(5.4151)
    fiveNumbs.add(12.71)
    fiveNumbs.add(47.31)

    println("The average of 5 numbers is ${avg(fiveNumbs)}")

}

fun avg(numbers: ArrayList<Double>): Double {
    var sum = 0.0
    var avg = 0.0

    for (elem in numbers) {
        sum += elem
    }
    avg = sum / numbers.size
    return avg
}