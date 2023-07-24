package TestConJunitServices;

import TestConJunitEntities.Rectangulo;

public class RectanguloServices {
    public double calcularArea(Rectangulo r){

        return r.getAncho() * r.getLargo();
    }
    public double CalcularPerimetro(Rectangulo r){
        return 2 * (r.getLargo() + r.getAncho());
    }
}
