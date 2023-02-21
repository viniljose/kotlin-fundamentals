package com.vinil.fp

val doThis:()->Unit={ println("Higher Order Function") }
fun doThat(){
    println("Another Way of HOF")
}
fun execute(action:()->Unit){
    action()
    action.invoke()
}
fun executeArg(display:(msg:String)->Unit){
    display("World")
}

fun main(){
  execute(doThis)
  execute(::doThat)
  execute({ println("How is this") })
  executeArg { println("Hello $it") }
}