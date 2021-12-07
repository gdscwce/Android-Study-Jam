package com.example.kotlintutorials

      /*
            It is a replacement of switch statement from other programmin languages
            Statements corresponding to only one range/value/condition inside when will be executed.
            If multiple ranges inside when satsfies the value , the first one satisfying is executed and others are not
     */

          /*
               in a .. b -> if variable is in range [a,b]
               in a until b -> if in [a , b)

               !in a .. b -> if variable is not in range [a,b]

               in a downTo b -> in [b , a]

               a,b,c -> exactly one of a or b or c

               else -> if none satisfies
           */

    fun main()
    {

        val dayNum = 6

        when(dayNum)
        {
            1 -> print("Chemistry Exam\n")
            2 -> print("Math Exam\n")
            3 -> print("BEE Exam\n")
            4 -> print("Arduino Exam\n")
            5 -> print("Life Science Exam\n")
            else -> print("No Exam\n")
        }

        val marks = 100

        when(marks)
        {
            in 85 .. 100 -> println("Passed with A grade")
            in 70 .. 84 -> println("Passed with B grade")
            in 55 .. 69 -> println("Passed with C grade")
            in 54 downTo 0 -> println("Failed")
            else -> println("Invalid Marks")
        }

        var a : Any = 'A'
        //a = 10
       // a = 10.5
        when (a)
        {
            is Int -> println("Integer")
            is Char -> println("Character")
            is String -> println("String")
            is Double -> println("Double")
            is Float -> println("Float")
            is Boolean -> println("Boolean")
            else -> println("Not known")
        }

    }