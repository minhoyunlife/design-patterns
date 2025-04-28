package org.example.strategy

abstract class Duck {
    abstract var flyBehavior: FlyBehavior
    abstract var quackBehavior: QuackBehavior

    abstract fun display()

    fun performFly() = flyBehavior.fly()

    fun performQuack() = quackBehavior.quack()

    fun swim() = println("Swim!!!")
}

class MallardDuck(
    override var flyBehavior: FlyBehavior = FlyWithWings(),
    override var quackBehavior: QuackBehavior = Quack(),
) : Duck() {
    override fun display() {
        println("Mallard Duck!!!!")
    }
}