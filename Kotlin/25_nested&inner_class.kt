package com.example.kotlintutorials

      /*
          * Nested Class : A class created inside another class
               nested class cant access members of outer class
               Nested class are by default static

         * Inner class : nested class with inner keyword. They can access members of outer class

       */


  class OuterClass{
      var name = "Abhijit"

      class NestedClass{
         fun meth1(){
         //    println("$name")    // name not accessible here
         }
      }

      inner class Innerclass{
          fun meth2(){
              println(name)
          }
      }
  }

    fun main()
    {
        val obj = OuterClass.NestedClass()
        val obj2 = OuterClass().Innerclass()
        obj2.meth2()
    }
