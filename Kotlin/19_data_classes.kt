package com.example.kotlintutorials

   data class PersonClass(var name : String = "" , var age : Int = 0)

    fun main()
    {
      val p1 = PersonClass("Abhijit" , 20)
       val name = p1.name
        println("name = $name")

        val p2 = p1.copy()
        val p3 = p2.copy(age = 25)
        println(p1)
        println(p2.toString())
        println(p3.toString())

        println(p1 == p2)

        val (name2 , age2) = p1
        println("$name2 $age2")


    }