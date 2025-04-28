package org.example.simplefactory

open class Pizza {
    open fun prepare() = println("---prepare---")

    open fun bake() = println("---bake---")

    open fun cut() = println("---cut---")

    open fun box() = println("---box---")

    protected fun name() = println("${this.javaClass.simpleName}!!!")
}

class CheesePizza : Pizza() {
    override fun prepare() {
        super.name()
        super.prepare()
    }

    override fun bake() {
        super.name()
        super.bake()
    }

    override fun cut() {
        super.name()
        super.cut()
    }

    override fun box() {
        super.name()
        super.box()
    }
}

class GreekPizza : Pizza() {
    override fun prepare() {
        super.name()
        super.prepare()
    }

    override fun bake() {
        super.name()
        super.bake()
    }

    override fun cut() {
        super.name()
        super.cut()
    }

    override fun box() {
        super.name()
        super.box()
    }
}

class PepperoniPizza : Pizza() {
    override fun prepare() {
        super.name()
        super.prepare()
    }

    override fun bake() {
        super.name()
        super.bake()
    }

    override fun cut() {
        super.name()
        super.cut()
    }

    override fun box() {
        super.name()
        super.box()
    }
}
