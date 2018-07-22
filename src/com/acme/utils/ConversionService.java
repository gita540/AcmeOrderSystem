package com.acme.utils;

public class ConversionService {
    /**
     * Weight conversion rates
     */

    // kilogramToPounds
    public static double kilogramToPound = 2.2046;
    // kilogram to grams
    public static int kilogramToGram = 1000;
    // kilogram to ounce
    public static double kilogramToOunce = 35.34;

    /**
     * Volume conversion rates
     */

    // liter to Ounce conversion
    public static float literToFluidOunce = 33.84f;

    // liter to gallon conversion

    public static float literToGallon = 0.264f;
    // liter to pints conversion
    public static float literToPints = 2.1134f;
    // liter to milliliter conversion

    public static short literToMilliliter = 1_000;

    public static double pounds(double kilograms) {
        return kilograms * kilogramToPound;
    }

    public static int grams(int l) {
        return l * kilogramToGram;
    }

    public static double ounce(double kilograms) {
        return kilograms * kilogramToOunce;
    }

    public static float fluidOunce(float liter) {
        return liter * literToFluidOunce;
    }

    public static float gallons(float liter) {
        return liter * literToGallon;
    }

    public static int milliLiters(int liter) {
        return liter * literToMilliliter;
    }

    public static float pints(float liter) {
        return liter * literToPints;
    }

}
