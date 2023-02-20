package com.vinil

import java.util.*

fun main(){
    println("Palindrome")
    println( isPalindromeJava("Steve and Steve"))
    println(isPalindromeJava("Sex at noon taxes"))
    println("Steve and Steve".isPalindrome())
    println("Sex at noon taxes".isPalindrome())
}

//Java in Kotlin
fun isPalindromeJava(string: String):Boolean {
    val test = string.lowercase(Locale.getDefault()).replace("""[\W+]""".toRegex(),"")
    return test==test.reversed()
}
//Extentions
fun String.isPalindrome()=this.lowercase(Locale.getDefault()).replace("""[\W+]""".toRegex(),"")
    .let{it==it.reversed()}