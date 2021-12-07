package com.example.kotlintutorials

   fun main()
   {
       var nullableName : String? = "Abhijit"
      nullableName = null

       // To assign nullable variable to non-nullable variable
       //     ?:        is "ELVIS OPERATOR"    if nullable variable has value "null" then our given default value will be assigned

       val name = nullableName ?: "Guest"
       println(name)

       // NOT NULL ASSERATION ->    !!
       /* converts nullable variable to non-nullable. DO THIS ONLY WHEN YOU ARE SURE VARIABLE DOESN'T HAVE VALUE "null" otherwise there will be exception*/

       val name2 = nullableName!!
       println(name2)

   }


