package org.example.observer

interface Observer {
    fun update()
}

class CurrentConditionDisplay(
    private var temperature: Float,
    private var humidity: Float,
    private var weatherData: WeatherData,
) : Observer {
    constructor(weatherData: WeatherData) : this(0f, 0f, weatherData) {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.humidity

        display()
    }

    private fun display() {
        println("Current: temp " + this.temperature + "F, hum " + this.humidity + "%")
    }
}
