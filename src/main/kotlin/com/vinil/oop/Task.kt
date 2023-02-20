package com.vinil.oop

class Task(val name:String) {
    var property=3;
}
fun main(){
    var myTask = Task().apply { property=4 }
}