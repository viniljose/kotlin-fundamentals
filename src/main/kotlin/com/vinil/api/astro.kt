package com.vinil.api

import com.google.gson.Gson
import java.net.URL

/**
 * http://open-notify.org/Open-Notify-API/People-In-Space/
 * This API returns the current number of people in space.
 * When known it also returns the names and spacecraft those people are on. This API takes no inputs.
 */


data class Assignment(val name:String,val craft:String)

data class AstroResponse(
    val message:String,
    val number:Int,
    val people:List<Assignment>
)
fun main(){
    val url = "http://api.open-notify.org/astros.json"
    println( URL(url).readText())
    val response = Gson().fromJson(URL(url).readText(),AstroResponse::class.java)
    println(response)
    println("There are "+response.number+" people in the space")
    for((name,craft) in response.people)
        println("$name boarded $craft")
}