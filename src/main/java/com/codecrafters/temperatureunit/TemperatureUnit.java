package com.codecrafters.temperatureunit;

import java.io.Serializable;

/**
 * Created by Ingo on 30.03.2016.
 */
public enum TemperatureUnit implements Serializable {

    KELVIN {
        public double toCelsius(double kelvin) {
            return kelvin - 273.15;
        }

        public double toFahrenheit(double kelvin) {
            return CELSIUS.toFahrenheit(KELVIN.toCelsius(kelvin));
        }

        public double fromCelsius(double celsius) {
            return CELSIUS.toKelvin(celsius);
        }

        public double fromFahrenheit(double fahrenheit) {
            return FAHRENHEIT.toKelvin(fahrenheit);
        }
    },

    CELSIUS {
        public double toKelvin(double celsius) {
            return celsius + 273.15;
        }

        public double toFahrenheit(double celsius) {
            return celsius * 9 / 5 + 32;
        }

        public double fromKelvin(double kelvin) {
            return KELVIN.toCelsius(kelvin);
        }

        public double fromFahrenheit(double fahrenheit) {
            return FAHRENHEIT.toCelsius(fahrenheit);
        }
    },

    FAHRENHEIT {
        public double toKelvin(double fahrenheit) {
            return CELSIUS.toKelvin(FAHRENHEIT.toCelsius(fahrenheit));
        }

        public double toCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

        public double fromCelsius(double celsius) {
            return CELSIUS.toFahrenheit(celsius);
        }

        public double fromKelvin(double kelvin) {
            return KELVIN.toFahrenheit(kelvin);
        }
    };

    public double toCelsius(double temperature) {
        return temperature;
    }

    public double toKelvin(double temperature) {
        return temperature;
    }

    public double toFahrenheit(double temperature) {
        return temperature;
    }

    public double fromCelsius(double celsius) {
        return celsius;
    }

    public double fromKelvin(double kelvin) {
        return kelvin;
    }

    public double fromFahrenheit(double fahrenheit) {
        return fahrenheit;
    }

}
