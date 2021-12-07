package com.example.kotlintutorials

/*
     1) lambda expression is function which has no name

     2) Lambda expression and anonymous function are "function literals " i.e. functions
       which are not declared but but passed immediately as an expression

     3) Lambda is defined with curly brackets which takes variables as parameters (if any) and body
       * The body of the function is written after parameters followed by -> operator

     SYNTAX : {VARIABLES -> BODY}
 */

                                               //PRINT    //RETURN
     val sum : (Int , Int, Int ) -> Int = {a , b , c  -> println(a+b+c) ; a+b+c}
    fun main()
    {
          println(sum(5 , 10 , -2))
    }