package com.vinil

import java.time.LocalDate
import java.time.Month

data class Person(val first: String, val last:String, val dob:LocalDate )

fun main(){
    val name1 = Person("Rocky","Rocks",LocalDate.of(1988,Month.APRIL,10))
    val name2 = Person("Rocky","Rocks",LocalDate.of(1988,Month.APRIL,10))
    println(name1)
    println(name1==name2) //operator overloading, == invokes the equals function
    println(name1===name2) // reference equality

    val robert = name1.copy(first = "Robert",dob=LocalDate.of(1987,Month.APRIL,15))
    println(robert)
    val people = setOf(name1,name2,robert)
    println(people)

    //Destructuring
    val(f,l,_)=robert //using _ avoids the waring of not using it
    println("$f $l")
    val(fi,la,dob)=name1
    println("$fi $la")

    //Infix functions e.g to
    val map = mapOf("Rky" to name1,"Rbt" to robert)
    println(map)
    for((key,value) in map)
        println("$key maps to $value")
}