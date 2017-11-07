package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AhPan on 11/6/17.
 */

public class ConverterUtilTest {
    @Test
    public void testConvertFahrenheitToCelsius() throws Exception {
        float boilingPointCActual = ConverterUtil.convertFahrenheitToCelsius(212);
        float boilingPointCExpected = 100;
        assertEquals("Conversion from fahrenheit to celsius failed",
                boilingPointCExpected, boilingPointCActual, 0.001);
    }
    @Test
    public void testConvertCelsiusToFahrenheit() throws Exception {
        float boilingPointFActual = ConverterUtil.convertCelsiusToFahrenheit(100);
        float boilingPointFExpected = 212;
        assertEquals("Conversion from celsius to fahrenheit failed",
                boilingPointFExpected, boilingPointFActual, 0.001);
    }
}
