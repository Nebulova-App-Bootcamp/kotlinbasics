package com.example.kotlinbasics

fun main(){


    // Inmutable variable
    // val name = "Jose"

    //TODO: ADD NEW FUNCTIONALITY

    /*
    this is
    a multiline
    comment
     */

    var name = "Jose"

    name = "Carlos"

    //print("hello again " + name)


    // var age = 25

    //Byte (8 bits), Short(16 bits), Int(32 bits), Long(64 bits)

    val myByte: Byte = 12
    val myShor: Short = 134
    val myInt: Int = 1233458858
    val myLong: Long = 12_1235_213_123_123_5559

    val l = 1L + 3 // Long + Int => Long
    println(l)

    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)


    //Floating numbers: Float (32 bits), Double (64 bits)

    val myFloat: Float = 12.34F
    val myDouble: Double = 3.14159

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
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    println(firstCharInStr)
    println(lastCharInStr)


    //Interpolación de Strings
    println("Primer caracter: $firstCharInStr \nlong de mi myStr: ${myStr.length}")

}


