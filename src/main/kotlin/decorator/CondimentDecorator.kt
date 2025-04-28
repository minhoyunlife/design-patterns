package org.example.decorator

abstract class CondimentDecorator : Beverage() {
    abstract val beverage: Beverage
    abstract override fun getDescription(): String
}

class Mocha(override val beverage: Beverage) : CondimentDecorator() {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Mocha"
    }

    override fun cost(): Double {
        return beverage.cost() + 0.2
    }
}

class Whip(override val beverage: Beverage) : CondimentDecorator() {
    override fun getDescription(): String {
        return "${beverage.getDescription()}, Whip"
    }

    override fun cost(): Double {
        return beverage.cost() + 0.1
    }
}
