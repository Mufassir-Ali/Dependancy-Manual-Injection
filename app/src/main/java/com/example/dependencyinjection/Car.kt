package com.example.dependencyinjection

class Car( var engine: Engine,var wheel: Wheel) {

    fun start(){
        engine.Start()
        wheel.moving()
    }
}