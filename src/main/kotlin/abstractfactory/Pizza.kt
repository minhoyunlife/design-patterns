package org.example.abstractfactory

abstract class Pizza() {
    open var name: String = ""
    open var dough: Dough? = null
    open var sauce: Sauce? = null
    open var veggies: List<Veggies> = emptyList()
    open var cheese: Cheese? = null
    open var pepperoni: Pepperoni? = null
    open var clam: Clam? = null

    abstract fun prepare()

    fun bake() {
        println("---Bake---")
    }

    fun cut() {
        println("---Cut---")
    }

    fun box() {
        println("---Box---")
    }
}

class CheesePizza(
    private val factory: PizzaIngredientFactory,
) : Pizza() {
    override fun prepare() {
        println("---Preparing... : $name ---")

        this.dough = factory.createDough()
        this.sauce = factory.createSauce()
        this.cheese = factory.createCheese()
    }
}

class ClamPizza(
    private val factory: PizzaIngredientFactory,
) : Pizza() {
    override fun prepare() {
        println("---Preparing... : $name ---")

        this.dough = factory.createDough()
        this.sauce = factory.createSauce()
        this.cheese = factory.createCheese()
        this.clam = factory.createClam()
    }
}
