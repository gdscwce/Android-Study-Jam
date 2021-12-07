package com.example.kotlintutorials


   /*In constructor firstName and lastName are initialised. If values not given
     while creating object , our given default values are given to firstName & lastname */
    class Person constructor(firstName : String = "default", lastName : String = "default")
    {
        init {
            // called when object is created
            println("Person created with firstname = $firstName and last name = $lastName")
        }
    }

   fun main()
   {
       var p = Person("Abhijit" , "Puri")
       var p2 = Person()
       var p3 = Person("abhijit")
       var p4 = Person(lastName = "Puri")
   }