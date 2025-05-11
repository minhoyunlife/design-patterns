package org.example.adapter

interface Turkey {
    fun gobble()

    fun fly()
}

class WildTurkey : Turkey {
    override fun gobble() {
        println("골골")
    }

    override fun fly() {
        println("짧은 거리를 날고 있어요~")
    }
}
