package com.vinil.oop

class Task(val name:String,_priority:Int=DEFAULT_PRIORITY) {
    var priority=validPriority(_priority);
   // set(value){
     //   priority = validPriority(value)
    //}

companion object{
    const val MIN_PRIORITY = 1
    const val MAX_PRIORITY = 5
    const val DEFAULT_PRIORITY = 3
}
    private fun validPriority(p:Int)=p.coerceIn(MIN_PRIORITY, MAX_PRIORITY)
}
fun main(){
    var myTask = Task("First", 9)
    println(myTask.priority)
}