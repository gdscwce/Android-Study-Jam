package com.example.kotlintutorials
import java.math.BigInteger
import java.util.*

          /*
                there are two types of variables in kotlin -

                1) var : they are mutable i.e. they can be reassigned / their values can be changed in program
                         BUT the changed value should be of same datatype

                2) val : they are immutable i.e. their values can't be changed after assigning for first time

           */

        fun main()
        {
//            var myNum = 10.5
//            myNum = 5.5
//            println("My number is " + myNum)

            val myName = "Abhijit"
           // myName = "Abhi"    // this is not allowed
            print("My name is $myName")                                             // In print statement , inside string to concat a variable use - $variable
                                                                                     // if some expression use ${expression}



        }