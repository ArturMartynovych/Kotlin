package com.tutorials.konlinbasics

fun variablesAndDatatypes() {
    //  immutable variable
    //  TODO: Add new functionality

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
    var course :String = "Android Masterclass"
    val floatingNumber : Float = 13.37F
    val pi : Double = 3.14159265358979
    var age : Byte = 25
    var year : Short = 2020
    var longNumber: Long = 18881234567
    var healthy : Boolean = true
    var firstCharacter : Char = 'a'
    print("$course $age $healthy")
}

fun main() {
    variablesAndDatatypesExercise()
}