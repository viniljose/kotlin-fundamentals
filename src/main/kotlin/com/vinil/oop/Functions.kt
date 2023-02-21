package com.vinil.oop

class Functions {
fun callDB(hostname: String = "localhost",
           username: String = "mysql",
           password:String = "secret"){
    println("These are default values $hostname $username $password")
}

}
fun<T> manyArgs(vararg va :T){
    for (i in va)
        println(i)
}
fun String.bmw()="I am BMW"
fun String.benz()="I am Benz"
fun main(){
    Functions().callDB()
    manyArgs(1,2,3)
    manyArgs(9,"hai")
    manyArgs(*"This is part of an array".split(" ").toTypedArray())

    val car = "I am a car"
    println(car.benz())
    println(car.bmw())

}