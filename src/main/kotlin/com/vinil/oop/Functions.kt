package com.vinil.oop

class Functions {
fun callDB(hostname: String = "localhost",
           username: String = "mysql",
           password:String = "secret"){
    println("These are default values $hostname $username $password")
}

}

fun main(){
    Functions().callDB()
}