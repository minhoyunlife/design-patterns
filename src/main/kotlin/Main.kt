package org.example

import org.example.decorator.Beverage
import org.example.decorator.Espresso
import org.example.decorator.Mocha
import org.example.decorator.Whip
//import org.example.factorymethod.ChicagoPizzaStore
//import org.example.factorymethod.NYPizzaStore
import org.example.abstractfactory.NYPizzaStore
import org.example.abstractfactory.ChicagoPizzaStore
import org.example.observer.CurrentConditionDisplay
import org.example.observer.WeatherData
import org.example.simplefactory.PizzaStore
import org.example.simplefactory.SimplePizzaFactory
import org.example.strategy.Duck
import org.example.strategy.FlyNoWay
import org.example.strategy.MallardDuck
import org.example.strategy.MuteQuack

fun main() {
//  example(strategy)
//    val mallard: Duck = MallardDuck()
//    mallard.performQuack()
//    mallard.performFly()
//
//    mallard.quackBehavior = MuteQuack()
//    mallard.performQuack()
//    mallard.performFly()
//
//    mallard.flyBehavior = FlyNoWay()
//    mallard.performQuack()
//    mallard.performFly()

//  example(observer)
//    val weatherData = WeatherData()
//    val currentConditionDisplay = CurrentConditionDisplay(weatherData)
//    weatherData.setMeasurements(80f, 65f, 30.4f)
//    weatherData.setMeasurements(82f, 70f, 29.2f)
//    weatherData.setMeasurements(78f, 90f, 29.3f)

//  example(decorator)
//    var beverage: Beverage = Espresso()
//    println(beverage.getDescription())
//    println(beverage.cost())
//
//    beverage = Mocha(beverage)
//    beverage = Mocha(beverage)
//    beverage = Whip(beverage)
//    println(beverage.getDescription())
//    println(beverage.cost())

//  example(simple factory)
//    val store = PizzaStore(SimplePizzaFactory())
//    store.orderPizza("greek")
//    store.orderPizza("pepperoni")

//  example(factory method)
//    val nyStore = NYPizzaStore()
//    val chStore = ChicagoPizzaStore()
//
//    val pizza1 = nyStore.orderPizza("cheese")
//    println(pizza1.name)
//
//    val pizza2 = chStore.orderPizza("cheese")
//    println(pizza2.name)

//  example(abstract factory)
//    val nyStore = NYPizzaStore()
//    nyStore.orderPizza("cheese")
//
//    val chStore = ChicagoPizzaStore()
//    chStore.orderPizza("clam")
}