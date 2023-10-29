package com.example.dependencyinjection

class Engine {

    var fuel = "Petrol"
    var RPM = "650ph"

    fun Start(){
        println("Starting..........")
        println("Your Engine Info:${engineInfo()}")
        println("Started")
    }

  private  fun engineInfo(): String{
        return "Fuel Type: $fuel RPM speed: $RPM"
    }
}