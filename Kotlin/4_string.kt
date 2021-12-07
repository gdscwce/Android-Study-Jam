package com.example.kotlintutorials

import java.util.*

fun main()
  {
      val myString : String = "my name is Abhijit"
      println(myString)

      // To get length of string
      println(myString.length)

      // To get a char at particular index
      println(myString[3])
      println(myString.get(0))

      // To get the index of some char or a substring appearing for first time in string
      println(myString.lastIndexOf('i'))  // checks from last here
      println(myString.indexOf("Abhi"))

      // To uppercase or lowercase
      println(myString.toUpperCase(Locale.ROOT))
      println(myString.toLowerCase(Locale.ROOT))

      // To get substring
      println(myString.substring(11 , 15))

      // To check if string contains a char or set of char
      println(myString.contains("Abhijit"))

      // To append a string
      println(myString.plus(" Puri"))

      // Replace a char or set with other
      println(myString.replace("ij" , "i"))

      // To convert string to int
      val numString = "500"
      var myInt = numString.toInt()

  }