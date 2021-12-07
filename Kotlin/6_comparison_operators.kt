package com.example.kotlintutorials

    //  == ,  != , > , >= ,  < , <=  //

      fun main()
      {
               val a = 5
               val b = 10
               val c = 5

          println("Is a equal to b : ${a==b}")
          println("Is a equal to c : ${a==c}")
          println("Is a less than b : ${a < b}")
          println("Is c greater b : ${c > b}")
          println("Is b not equal to c : ${b != c}")


          val s1 = "Abhijit"
          val s2 = "Abhijit"
          val s3 = String(StringBuffer("Abhijit"))
          println(s3 == s1)
          println(s1 == s2)
      }