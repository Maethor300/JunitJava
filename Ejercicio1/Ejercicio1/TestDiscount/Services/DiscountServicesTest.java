package Services;

import Entitie.DiscountCalculator;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiscountServicesTest {
     DiscountServices rs;
     @Before
     public void beforeInstance(){
       rs = new DiscountServices();
     }
     @Test
     public void testDiscount(){
         assertEquals(10,rs.calcularDiscount(new DiscountCalculator(100, 10)),0);
         assertEquals(0,rs.calcularDiscount(new DiscountCalculator(100, 100)),0);
         assertEquals(100,rs.calcularDiscount(new DiscountCalculator(100, 0)),0);
     }



}