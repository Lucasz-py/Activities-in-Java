/**
 * Class Circulo.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Circulo extends Elipse{
    /**
    * ★ Constructor de Objeto de clase Circulo
    * @param p_radio asigna el valor del radio.
    * @param p_centro asigna el obejo de clase Punto.
    */
    public Circulo(double p_radio, Punto p_centro){
        super(p_radio, p_radio, p_centro);
    }
    
    public String nombreFigura(){
        return "****Circulo****";
    }
}