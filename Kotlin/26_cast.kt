package com.example.kotlintutorials

     /*
        Sometimes it is not possible to cast a variable and it throws an exception
        This is called unsafe cast. Done by using "as" keyword

        "as?" is safe cast operator . If  have null , it gives null value to variable instead of exception

      */


    fun main()
    {
        val name : Any? = "Abhijit"
        val name2 : Any? = null

        val name3 = name as String           // It is possible to cast here
       // val name4 = name2 as String                // Not possible to cast into string as variable has "null"

        println(name3)


        val name5 : String? = name2 as? String
        println(name5)

    }