package TestConJunitEntities ;

import TestConJunitServices.RectanguloServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {
         RectanguloServices rs;
       @BeforeEach
       public void setUp(){
           rs = new RectanguloServices();

       }
       @Test
       public void deberiaInicializarConColor(){
           assertNotNull(new Rectangulo(10,10).getColor()
           );
   }
       @Test
       public void deberiaCalcularArea(){
           assertEquals(100, rs.calcularArea(new Rectangulo(10,10)), 0);
       }
       @Test
       public void deberiaCalcularPerimetro(){
           assertEquals(40, rs.CalcularPerimetro(new Rectangulo(10, 10)));
           assertEquals(30, rs.CalcularPerimetro(new Rectangulo(7.5,7.5)));
       }
       @Test
       public void deberiaActiveOODesactive(){
           Rectangulo rectangulo = new Rectangulo(5,5);
           assertTrue(rectangulo.isActive());
       }


}