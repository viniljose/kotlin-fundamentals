package com.vinil.fp

val doThis:()->Unit={ println("Higher Order Function") }
fun execute(action:()->Unit){
    action()
    action.invoke()
}


fun main(){
  execute(doThis)
}