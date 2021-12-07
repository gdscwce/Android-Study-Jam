package com.example.kotlintutorials

             // 1) Variables defined in some fun / class can't be accessed outside it directly. So this is the scope of these variables
             // 2) Variables of class can be accessed using object of that class


     fun main()
     {
         println(myFun(5))
         val myClass = MyClass()
         print(myClass.b)
     }


  class MyClass()
     {
         var b = 5
     }


    private fun myFun (a : Int) : Int
    {
       //  a += 5   not allowed as a is a parameter not variable
        var a = a   // this is called as shadowing. But now parameter a can not be accessed
        a += 5
        return a
    }