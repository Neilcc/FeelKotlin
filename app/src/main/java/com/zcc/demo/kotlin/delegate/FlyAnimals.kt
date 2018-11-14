package com.zcc.demo.kotlin.delegate

interface CanFly {
    fun fly()
}

class Wings {
    fun move() {

    }
}

class AnimalWithWings : CanFly {
    val wings: Wings = Wings()
    override fun fly() = wings.move()
}

interface FlyingAni {
    val wings: Wings
    fun fly() = wings.move()
}

class Bird(override val wings: Wings = Wings()) : FlyingAni

class Bird2(f: CanFly) : CanFly by f

fun t() {
    Bird2(AnimalWithWings()).fly()
}