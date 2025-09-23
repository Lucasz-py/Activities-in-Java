
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Rectangulo{
    
    public Cuadrado(Punto p_punto, double p_lado){
        super(p_punto, p_lado, p_lado);
    }
    
    public String nombreFigura(){
        return super.nombreFigura();
    }
    
    public void caracteristicas(){
        super.caracteristicas();
    }
}