package com.example.dependencyinjection

class Wheel {
    var rim = "Allow rim"
    var tyer = "MRF"
    var tube = "Gazi"

    private fun WheelInfo():String{
        return "Rim: $rim, Tyre: $tyer, Tube: $tube"
    }

    fun moving(){
        println("Moving.......")
        println("Wheel Info: ${WheelInfo()}")
    }
}