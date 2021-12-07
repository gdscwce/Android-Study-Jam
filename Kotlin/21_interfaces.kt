package com.example.kotlintutorials

   interface MyInterface
   {
       var name: String                // abstract variable
       fun walk() : String              // abstract method
       fun eat()                       // concrete method
       {
           println("I am eating")
       }

   }

  class MYclass : MyInterface
  {
       override var name = ""

      override fun walk(): String {
          println("I am walking")
          return ""
      }
  }