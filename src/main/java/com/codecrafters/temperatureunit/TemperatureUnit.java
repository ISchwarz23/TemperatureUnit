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

        public double toKelvin(double kelvin) {
            return kelvin;
        }

        public double toFahrenheit(double kelvin) {
            return CELSIUS.toFahrenheit(KELVIN.toCelsius(kelvin));
        }
    },

    CELSIUS {
        public double toKelvin(double celsius) {
            return celsius + 273.15;
        }

        public double toCelsius(double celsius) {
            return celsius;
        }

        public double toFahrenheit(double celsius) {
            return celsius * 9 / 5 + 32;
        }
    },

    FAHRENHEIT {
        public double toKelvin(double fahrenheit) {
            return CELSIUS.toKelvin(FAHRENHEIT.toCelsius(fahrenheit));
        }

        public double toCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }

        public double toFahrenheit(double fahrenheit) {
            return fahrenheit;
        }
    };

    public double toCelsius(double temperature) {
        throw new AbstractMethodError();
    }

    public double toKelvin(double temperature) {
        throw new AbstractMethodError();
    }

    public double toFahrenheit(double temperature) {
        throw new AbstractMethodError();
    }

}
