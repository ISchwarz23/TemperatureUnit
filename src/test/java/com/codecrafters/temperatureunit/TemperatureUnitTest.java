package com.codecrafters.temperatureunit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the correctness of {@link TemperatureUnit}.
 *
 * @author ISchwarz
 */
public class TemperatureUnitTest {

    private static final double TEMP_KELVIN = 283.15;
    private static final double TEMP_CELSIUS = 10;
    private static final double TEMP_FAHRENHEIT = 50;

    private static final double VALID_DELTA = 0.001;

    @Test
    public void testKelvinToKelvin() {
        assertEquals(TEMP_KELVIN, TemperatureUnit.KELVIN.toKelvin(TEMP_KELVIN), VALID_DELTA);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(TEMP_CELSIUS, TemperatureUnit.KELVIN.toCelsius(TEMP_KELVIN), VALID_DELTA);
    }

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(TEMP_FAHRENHEIT, TemperatureUnit.KELVIN.toFahrenheit(TEMP_KELVIN), VALID_DELTA);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(TEMP_KELVIN, TemperatureUnit.CELSIUS.toKelvin(TEMP_CELSIUS), VALID_DELTA);
    }

    @Test
    public void testCelsiusToCelsius() {
        assertEquals(TEMP_CELSIUS, TemperatureUnit.CELSIUS.toCelsius(TEMP_CELSIUS), VALID_DELTA);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(TEMP_FAHRENHEIT, TemperatureUnit.CELSIUS.toFahrenheit(TEMP_CELSIUS), VALID_DELTA);
    }

    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(TEMP_KELVIN, TemperatureUnit.FAHRENHEIT.toKelvin(TEMP_FAHRENHEIT), VALID_DELTA);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(TEMP_CELSIUS, TemperatureUnit.FAHRENHEIT.toCelsius(TEMP_FAHRENHEIT), VALID_DELTA);
    }

    @Test
    public void testFahrenheitToFahrenheit() {
        assertEquals(TEMP_FAHRENHEIT, TemperatureUnit.FAHRENHEIT.toFahrenheit(TEMP_FAHRENHEIT), VALID_DELTA);
    }

    @Test
    public void testKelvinFromKelvin() {
        assertEquals(TEMP_KELVIN, TemperatureUnit.KELVIN.fromKelvin(TEMP_KELVIN), VALID_DELTA);
    }

    @Test
    public void testKelvinFromCelsius() {
        assertEquals(TEMP_KELVIN, TemperatureUnit.KELVIN.fromCelsius(TEMP_CELSIUS), VALID_DELTA);
    }

    @Test
    public void testKelvinFromFahrenheit() {
        assertEquals(TEMP_KELVIN, TemperatureUnit.KELVIN.fromFahrenheit(TEMP_FAHRENHEIT), VALID_DELTA);
    }

    @Test
    public void testCelsiusFromKelvin() {
        assertEquals(TEMP_CELSIUS, TemperatureUnit.CELSIUS.fromKelvin(TEMP_KELVIN), VALID_DELTA);
    }

    @Test
    public void testCelsiusFromCelsius() {
        assertEquals(TEMP_CELSIUS, TemperatureUnit.CELSIUS.fromCelsius(TEMP_CELSIUS), VALID_DELTA);
    }

    @Test
    public void testCelsiusFromFahrenheit() {
        assertEquals(TEMP_CELSIUS, TemperatureUnit.CELSIUS.fromFahrenheit(TEMP_FAHRENHEIT), VALID_DELTA);
    }

    @Test
    public void testFahrenheitFromKelvin() {
        assertEquals(TEMP_FAHRENHEIT, TemperatureUnit.FAHRENHEIT.fromKelvin(TEMP_KELVIN), VALID_DELTA);
    }

    @Test
    public void testFahrenheitFromCelsius() {
        assertEquals(TEMP_FAHRENHEIT, TemperatureUnit.FAHRENHEIT.fromCelsius(TEMP_CELSIUS), VALID_DELTA);
    }

    @Test
    public void testFahrenheitFromFahrenheit() {
        assertEquals(TEMP_FAHRENHEIT, TemperatureUnit.FAHRENHEIT.fromFahrenheit(TEMP_FAHRENHEIT), VALID_DELTA);
    }

}
