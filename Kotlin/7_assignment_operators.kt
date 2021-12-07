package com.example.kotlintutorials

       // = , += , *= , /= , -= , %=

       // Increment opertor : a++   , ++a
       // Decrement operator : a--  , --a


      fun main()
      {
          var a = 4

          a += 5
          print("a = $a ")

          a *= 2
          println("a = $a ")

          var b = 10
          var c = 10
          println("b = ${b++}")
          println("b = $b")
          println("c = ${++c}")

      }