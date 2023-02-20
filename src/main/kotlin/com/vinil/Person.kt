package com.vinil

import java.time.LocalDate

data class Person(val name: String,val dob:LocalDate )

fun main(){
    val name1 = Person("Rocky",LocalDate.now())
    val name2 = Person("Rocky",LocalDate.now())
    println(name1)
    println(name1==name2)
    println(name1===name2)
}