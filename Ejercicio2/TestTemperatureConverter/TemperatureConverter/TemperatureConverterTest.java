package TemperatureConverter;

import TemperaturaServices.TemperaturaServices;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterTest {
    TemperaturaServices rc;
   @Before
   public void BeforeTem(){
       rc = new TemperaturaServices();
   }
   @Test
   public void testGrados(){
       assertEquals(89.6,rc.celsiusToFahernheit(new TemperatureConverter(32)),0);
       assertEquals(33.333333333333336, rc.fahernheitToCelsius(new TemperatureConverter(92)),0);

   }

}