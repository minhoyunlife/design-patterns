package org.example.observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}

class WeatherData(
    private val observers: MutableList<Observer> = mutableListOf(),
    var temperature: Float = 0f,
    var humidity: Float = 0f,
    private var pressure: Float = 0f,
) : Subject {
    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

    fun setMeasurements(temp: Float, humid: Float, press: Float) {
        temperature = temp
        humidity = humid
        pressure = press

        notifyObservers()
    }
}
