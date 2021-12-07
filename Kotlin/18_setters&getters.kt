package com.example.kotlintutorials

     class myClass
     {
        var name = ""
            private set(value) {field = value}     // variable cant be set outside class if setter is private
         get(){
             return field
         }

         var age = 18
             private set(value)
             {
                 field = if (value > 18) value
                 else 18
             }
         get(){
             return field
          }

         var address = ""
             private set(value){
                 field = "Marsul"                      // address will always be set to Marsul
             }
         get(){
             return field
         }

         constructor(name : String , age : Int , address : String){
             this.name= name
             this.age = age
             this.address = address
         }
     }

      fun main()
      {
          val a1 = myClass("Abhijt" , 0 , "Umarkhed")
          println(a1.name + " " + a1.age + " " + a1.address)
      }