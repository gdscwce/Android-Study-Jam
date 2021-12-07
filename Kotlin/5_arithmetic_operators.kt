package com.example.kotlintutorials

    fun main()
    {
        val a = 10
        val b = 3

        var result = a+b
        println(result)

        result = a-b
        println(result)

        result = a*b
        println(result)

        val resultDouble : Double = a.toDouble()/b                   // Type Casting of a from int to double
        println(resultDouble)

        result = a % b
        println(result)


    }