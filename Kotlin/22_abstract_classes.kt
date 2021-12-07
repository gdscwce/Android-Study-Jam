package com.example.kotlintutorials

    abstract class AbstractClass
    {
        var a = 5                  // concrete variable
        abstract var b : Int      // abstract variable
       abstract fun meth1()       // abstract method

        fun meth2()
        {                              //concrete method
          println("method 2")
        }
    }

    class ChildClass : AbstractClass()
    {
        override var b = 5
        override fun meth1() {
            println("Meth1 form child class")
        }

    }