package com.example.kotlintutorials

    fun main()
    {
        for (i in 1 .. 100)    // Executes for i in [1 , 100]
        {
            print("$i ")
        }
        println()

        for (a in 1 .. 20 step 2) print("$a ")      // increments a by 2 each time

        println()

        for (a in 30 downTo 10 step 5) print("$a ")   // decrements a by 5 and loop executes for value of a in 30 down to 10

        println()

        for (a in 'A' until 'Z')   // Executes until a is not equal to 'Z'
        {
            print("$a ")
        }
        // for (a in 'A'.until('Z')) is same as above


        println()
        val abc = 5
        for (num in 0 .. abc){
            print("$num ")
        }

    }