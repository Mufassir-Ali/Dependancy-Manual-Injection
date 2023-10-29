package com.example.dependencyinjection

import com.example.dependencyinjection.objectContainer.engine
import com.example.dependencyinjection.objectContainer.wheel

fun main(){
    val car = Car(engine,wheel)
    car.start()
}