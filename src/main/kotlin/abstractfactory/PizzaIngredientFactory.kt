package org.example.abstractfactory

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clam
}

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarianaSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(Garlic(), Onion(), Mushroom(), RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clam {
        return FreshClams()
    }
}

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(BlackOlives(), EggPlant(), Spinach())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clam {
        return FrozenClams()
    }
}
