package com.example.kotlintutorials

     private class Student
     {
         // member variables
          var name : String = ""
          var age : Int = 18
         lateinit var college : String         // If you dont want to initalise variable while declaring it , use 'lateinit'
                                               // Not possible for primitive datatypes
                                               // But make sure you dont use it before initialising. otherwise you'll get error

         // member method
        fun showInfo()
         {
             println("Name : $name , age = $age , college = $college")
         }

         // Secondary constructors
         constructor(name : String , age: Int , college: String)
         {
                this.name = name
                this.age = age
                this.college = college
         }
         constructor()
     }

  fun main()
  {
      val s1 = Student()
      s1.age = 20
      s1.name = "Abhijit"
      s1.college = "WCE"

      val s2 = Student("Abhijit" , 19 , "WCE")
      s2.showInfo()
      s1.showInfo()
  }