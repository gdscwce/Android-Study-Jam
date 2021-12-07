package com.example.kotlintutorials

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.IndexOutOfBoundsException

fun main()
    {
        val a = 5 ; val b = 0

        try {
            validate(a)
        }
        catch (e : Exception){
            println(e.localizedMessage)
        }


        try
            {
                println(a / b)

            }
        catch (e : ArithmeticException)
            {
                println(e)
            }
        catch (e : IndexOutOfBoundsException)
            {
                println(e)
            }
        finally
            {
                println("Finally block")
            }
    }

    fun validate(a : Int){
        if (a > 4) {
            throw Exception("greater than 4 exception")
        }
        println("a = $a")
    }