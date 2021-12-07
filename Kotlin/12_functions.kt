package com.example.kotlintutorials


    /*
         SYNTAX :
              fun function_name(variable_name : Datatype , variable_name : Datatype) : Return_Datatype
              {
               code to execute
              }

     */



   fun main()
   {
       myFun()
       println(add(5,10))
       println(gcd(9 , 21))
   }

    fun myFun()
    {
        println("This is my Function")
    }

    fun add(a : Int , b : Int) : Int
    {
        return a+b
    }
           // Alternative shorter way of above add Function :
   //  fun add(a : Int , b : Int) : Int = a + b ;



  // Recursion
      fun gcd(a: Int , b: Int) : Int = if (b == 0) a else gcd(b , a % b)
