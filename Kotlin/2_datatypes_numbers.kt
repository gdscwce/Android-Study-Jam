package com.example.kotlintutorials

import java.math.BigInteger

/*
            In kotlin , it is not necessary to specify datatype. It is automatically identified by compiler
            But if we want to we can .
          | ------------------------------------------------------- |
          |  SYNTAX : var/val (variable_name) : Datatype = value    |
          | ------------------------------------------------------- |

         NUM DATATYPES : Byte , Short , Int , Long , Float , Double
 */

    fun main()
    {
        val myByte : Byte = 100
        val myShort : Short = 2500
        val myInt : Int = 100000000
        val myLong : Long = 100000000000000000
        val myFloat : Float = 3.14f
        val myDouble : Double = 3.1457845614879
        val myBigInt : BigInteger = BigInteger("9999999999999999999999999999999999999999999999999999")
        print("$myByte $myShort $myInt $myLong $myFloat $myDouble $myBigInt")
    }