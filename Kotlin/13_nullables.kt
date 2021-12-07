package com.example.kotlintutorials

    fun main()
    {
        var name : String = "Abhijit"
      //  name = null   // -> Not allowed ! Can't assign null to a variable having non-null value already
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        var nullableName : String? = "Abhi"    // after adding ? after datatype , we can now assign null to variable
        //nullableName = null

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------



      // println(nullableName.length)        // Not possible to do operations on variable if it is "nullable"

      // To solve this problem , add '?' after variable name.    If object has value "null" it will return null , but if it is not null , operation will be executed

          println(nullableName?.length)

     // Old way of checking if nullable object has value "null". Does nothing if variable has value "null"
          if (nullableName != null)
          {
              println(nullableName.length)
          }
        else {
              null
          }

         var name2 : String? = "Abhijit"
        name2 = null

     // New way in Kotlin. Works same as above
         nullableName?.let { println(nullableName.length) }

    }