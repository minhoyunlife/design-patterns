package org.example.decorator

abstract class Beverage {
    abstract fun getDescription(): String
    abstract fun cost(): Double
}

class Espresso : Beverage() {
    override fun getDescription(): String {
        return "Espresso"
    }

    override fun cost(): Double {
        return 1.99
    }
}

class HouseBlend : Beverage() {
    override fun getDescription(): String {
        return "HouseBlend"
    }

    override fun cost(): Double {
        return 0.89
    }
}

