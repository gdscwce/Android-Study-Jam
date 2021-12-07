package com.example.kotlintutorials

import java.lang.reflect.Array
import java.util.*
import kotlin.collections.ArrayList

fun main()
    {
        val arrList : ArrayList<Any> = ArrayList()    // CREATING EMPTY ARRAYLIST
        val arr2List : ArrayList<Int> = ArrayList(5)  // CREATING ARRAYLIST SOME WITH INITIAL SIZE
        val arr3List = arrayListOf<String>("Abhijit" , "Puri" , "String3")  // CREATING ARRAYLIST WITH SOME ELEMENTS
        val list : MutableList<Any> = mutableListOf<Any>()
        var list1 = LinkedList<Int>()



        arrList.add(5)
        arrList.add("Abhijit")
        arrList[1] = "abhijit"
        list.addAll(arrList)

        for (value in arrList) println(value)
        for (value in list) println(value)

         println(arrList.size)
        println(arrList[1])

    }