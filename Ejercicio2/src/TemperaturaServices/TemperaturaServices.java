package TemperaturaServices;

import TemperatureConverter.TemperatureConverter;

public class TemperaturaServices {

     public double celsiusToFahernheit(TemperatureConverter r){
        return (r.getGrados() * 1.8) + 32;
    }
    public double fahernheitToCelsius(TemperatureConverter r){
         return (r.getGrados() - 32) * 5/9;
    }
}
