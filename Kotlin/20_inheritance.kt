package com.example.kotlintutorials

   /*
        A class can inherit from another class . It will be called child class/sub class
        The class from which it is inherited is parent class/super class

        SYNTAX : class childClassName(constructor variables) : parentClass(variables for constructor){
                                body
                 }


        Super class must be open. By default all classes are private

        child class can implement the methods of parent class or they can be overriden
        For overriding method in parent class must be made open

        In Kotlin variables can also be overriden

    */

          // PARENT CLASS
      open class Animal(open var name: String) {

              open fun walk()
          {
              println("$name is walking")
          }

              init{
                  println("Parent class init")
              }
      }

       // CHILD CLASS
     class Cat(name : String) : Animal(name)
     {
            override
            fun walk()
            {
                println("Cat $name is walking")
            }

            override var name = name + " cat"

            init {
                println("Child class init")
            }
     }

   fun main()
   {
       val c1 = Cat("Alice")
       c1.walk()
   }