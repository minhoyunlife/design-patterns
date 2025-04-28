package org.example.factorymethod

abstract class Pizza(
    var name: String,
    private var dough: String,
    private var sauce: String,
    private var toppings: List<String>,
) {
    fun prepare() {
        println("---Prepare---")
        println("Set dough...")
        println("Set sauce...")
        println("Set toppings...")

        for (topping in toppings) {
            println(" $topping")
        }
    }

    open fun bake() {
        println("---Bake---")
    }

    open fun cut() {
        println("---Cut---")
    }

    open fun box() {
        println("---Box---")
    }
}

class NYStyleCheesePizza : Pizza(
    name = "New York Style Cheese Pizza",
    dough = "Thin crusted dough",
    sauce = "Marinara Sauce",
    toppings = listOf("Regiano Cheese")
)

class ChicagoStyleCheesePizza : Pizza(
    name = "Chicago Style Cheese Pizza",
    dough = "Thick crusted dough",
    sauce = "Tomato Sauce",
    toppings = listOf("Mozzarella Cheese")
) {
    override fun cut() {
        println("---Cut in 4 squared---")
    }
}