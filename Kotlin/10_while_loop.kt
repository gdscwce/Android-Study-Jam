package com.example.kotlintutorials

     // Executes a block of code repeatedly as long as the condition is true
     // while (condition){code}

    // do {code} while(condition) is used when code needs to run at least one time

   fun main()
   {
       var a = 'A'
       while (a <= 'Z')
       {
           print("$a ")
           a++
       }
       println()
       var i = 100
       do
       {
           print("$i ")
           i++
       } while(i < 10)
   }

