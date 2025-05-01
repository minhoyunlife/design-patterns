package org.example.abstractfactory

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
        val pizza: Pizza
        val ingredientFactory = NYPizzaIngredientFactory()

        when (type) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "NY Style Cheese Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "NY Style Clam Pizza"
            }
//            "veggie" -> NYStyleVeggiePizza()
//            "pepperoni" -> NYStylePepperoniPizza()
            else -> error("not supported type")
        }
        return pizza
    }
}

class ChicagoPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        val pizza: Pizza
        val ingredientFactory = ChicagoPizzaIngredientFactory()

        when (type) {
            "cheese" -> {
                pizza = CheesePizza(ingredientFactory)
                pizza.name = "Chicago Style Cheese Pizza"
            }
            "clam" -> {
                pizza = ClamPizza(ingredientFactory)
                pizza.name = "Chicago Style Clam Pizza"
            }
//            "veggie" -> NYStyleVeggiePizza()
//            "pepperoni" -> NYStylePepperoniPizza()
            else -> error("not supported type")
        }
        return pizza
    }
}