package org.example.factorymethod

abstract class PizzaStore {
    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    protected abstract fun createPizza(type: String): Pizza
}

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> NYStyleCheesePizza()
//            "veggie" -> NYStyleVeggiePizza()
//            "clam" -> NYStyleClamPizza()
//            "pepperoni" -> NYStylePepperoniPizza()
            else -> error("not supported type")
        }
    }
}

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return when (type) {
            "cheese" -> ChicagoStyleCheesePizza()
//            "veggie" -> ChicagoStyleVeggiePizza()
//            "clam" -> ChicagoStyleClamPizza()
//            "pepperoni" -> ChicagoStylePepperoniPizza()
            else -> error("not supported type")
        }
    }
}
