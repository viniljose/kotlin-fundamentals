package com.vinil.fp

import java.util.Date

data class Event(val title:String){
    var date = Date()
    var time = ""
    var attendees = mutableListOf<String>()
    fun create(){
        println(this)
    }
}
fun main(){
    val allHands = Event("Bangalore All Hands")
    allHands.date=Date(2023,1,1)
    allHands.time="0800H"
    allHands.attendees.add("Rahul")
    allHands.create()
}