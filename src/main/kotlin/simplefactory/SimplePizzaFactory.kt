package org.example.simplefactory

class SimplePizzaFactory {
    fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> CheesePizza()
            "greek" -> GreekPizza()
            "pepperoni" -> PepperoniPizza()
            else -> error("not supported type")
        }
    }
}
