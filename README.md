# TemperatureUnit
An implementation of a TemperatureUnit in Java inspired by the TimeUnit

## Usage of TemperatureUnit
The `TemperatureUnit` can be used to transform between different time units.

Transforming *to* another unit:
```java
double temperatureInKelvin = 273.15;
double temperatureInCelsius = TemperatureUnit.KELVIN.toCelsius(temperatureInKelvin);
double temperatureInFahrenheit = TemperatureUnit.CELSIUS.toFahrenheit(temperatureInCelsius);
```

Transforming *from* another unit:
```java
double temperatureInKelvin = 273.15;
double temperatureInCelsius = TemperatureUnit.CELSIUS.fromKelvin(temperatureInKelvin);
double temperatureInFahrenheit = TemperatureUnit.FAHRENHEIT.fromCelsius(temperatureInCelsius);
```

## Usage of Temperature
The Temperature is a unit independent wrapper. On the other hand it allows to get the corresponding temperature for all TemperatureUnits.
```java
Temperature temperature = new Temperature(273.15, TemperatureUnit.KELVIN);
double temperatureInKelvin = temperature.inKelvin();
double temperatureInCelsius = temperature.inCelsius();
double temperatureInFahrenheit = temperature.inFahrenheit();
```