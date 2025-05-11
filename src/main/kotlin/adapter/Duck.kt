package org.example.adapter

interface Duck {
    fun quack()

    fun fly()
}

class MallardDuck : Duck {
    override fun quack() {
        println("꽥!")
    }

    override fun fly() {
        println("날고 있어요!!!")
    }
}
