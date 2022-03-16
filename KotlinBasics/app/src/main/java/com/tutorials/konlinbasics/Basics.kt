package com.tutorials.konlinbasics

import java.util.*

fun variablesAndDatatypes() {
    //  immutable variable
//      TODO: Add new functionality

    // type string
    val myName = "Artur"
    // type int 32 bit
    var myAge = 19

    // Integer TYPES: Byte (8 bit), Short (16 bit),
    // Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.1415926535897932

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("Hello $myName")
}

fun variablesAndDatatypesExercise() {
    val course :String = "Android Masterclass"
    val floatingNumber : Float = 13.37F
    val pi : Double = 3.14159265358979
    val age : Byte = 25
    var year : Short = 2020
    var longNumber: Long = 18881234567
    val healthy : Boolean = true
    var firstCharacter : Char = 'a'
    print("$course $age $healthy")
}

fun operators() {
    //Arithmetic operators (+, -, *, /, %)
    var result = 5+3
    result /= 2
    // alternatively
    // result /= 2
    result *= 5
    result -= 1
    val moduloResult = 5%2
    println( moduloResult)

    //Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    // Concatenation - adding of "Strings"
    println("isEqual is $isEqual")
    val isNotEqual = 5!=5
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")
}

fun ifWhen() {
    val heightPerson1 = 170
    val heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("use your power technique")
    } else {
        println("use technique")
    }

    val age = 19
    if (age >= 21) {
        println("now you may drink in the US")
    } else if (age >= 18) {
        println("you may vote now")
    } else if (age >= 16) {
        println("you may drive now")
    } else {
        println("you are too young")
    }

    var name = "Artur"

    if (name == "Artur") {
        println("Welcome home $name")
    } else {
        println("Who are you?")
    }
    val isRainy = true
    if (isRainy)
        println("it's rainy")

    var season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println(("Autumn"))
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid season")
    }

    when (age) {
        in 21..150 -> println("now you may drink in the US")  // !in 0..20 is the same lik in 21..etc
        in 18..20 -> println("you may vote now")
        16, 17 ->  println("you may drive now")
        else -> println("you are too young")
    }

    var x : Any = 13.37
    when (x) {
        is Int -> print("$x is an Int")
        is Double -> print("$x is an Double")
        is String -> print("$x is an String")
        else -> print("$x is none of the above")
    }

}


fun whileLoops() {
    var x = 1
//    while (x <= 10) {
//        println("$x")
//        x++
//    }
    println("\n while loop is done")
    var m = 100
    while (m >= 0) {
        print("$m")
        m -= 2
    }
    println("\n while loop is done")

    do {
        println("$x")
        x++
    } while (x <= 10)
    println("while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now")
        }
    }

}


fun forLoops() {
    for (num in 1..10) {
        print("$num")
    }
    for (i in 1 until 10) {
        print("$i ")
    }
    for (i in 10 downTo 1) {
        println("\n $i")
    }
}


fun loopExercise() {
    // First task
//    for (i in 0 until 10000) {
//        when {
//            i <= 9000 -> println("$i")
//            i > 9000 -> println("$i IT'S OVER 9000!!!")
//        }
//    }

    // Second task
    var humidity = "humid"
    var humidityLevel = 80

    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased")
        if (humidityLevel < 60) {
            println("It's comfy now")
            humidity = "comfy"
        }
    }
    for (x in 0..9) {
        for (y in 0..9) {
            println("Result = ${x * y}")
        }
    }
}


fun breakAndContinue() {
    for (i in 1 until 20) {

        if (i / 2 == 5) {
            continue
        }
        println("$i ")
    }
    println("Done with the loop")
}

// parameter
fun addUp(a: Int, b: Int) : Int {
    return a + b
}


fun average(a: Double, b: Double) : Double {
    return (a + b) / 2
}


fun nullables() {
//    var name : String = "Artur"
    // name = null -> Compilation ERROR
    var nullableName : String? = "Artur"
//    nullableName = null

//    println(nullableName?.lowercase())


// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // ?: Elvis operator
    // if nullable name is empty, then use my default value
    val name = nullableName ?: "Guest"
    println("name is $name")

    println(nullableName!!.lowercase())

//    val wifesAge: String? = user?.wife?.age ?: 0

    /*
    if (nullableName != null) {
        var len2 = nullableName.length
    } else {
        null
    }
    */

}


fun main() {
//    variablesAndDatatypesExercise()
//    operators()
//    ifWhen()
//    whileLoops()
//    forLoops()
//    loopExercise()
//    breakAndContinue()
    // Arguments (a and b)
//    var result = average(5.32, 3.732)
//    println("result is $result")
    nullables()
}
