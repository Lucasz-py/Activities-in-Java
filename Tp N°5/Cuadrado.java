/**
 * Clase Cuadrado.
 * Hereda de Rectangulo y representa una figura cuadrada.
 * Un cuadrado es un caso especial de rectángulo donde el ancho y el alto (lado) son iguales.
 * * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Rectangulo{
    
    /**
     * Constructor de la clase Cuadrado.
     * Llama al constructor de la superclase Rectangulo pasando el mismo valor para ancho y alto.
     * @param p_punto El punto de origen (superior izquierdo) del cuadrado (Punto).
     * @param p_lado La longitud de los lados del cuadrado (double).
     */
    public Cuadrado(Punto p_punto, double p_lado){
        super(p_punto, p_lado, p_lado);
    }
    
    /**
     * Devuelve el nombre de la figura.
     * Llama al método de la superclase Rectangulo.
     * @return El nombre de la figura (String).
     */
    public String nombreFigura(){
        return super.nombreFigura();
    }
    
    /**
     * Muestra las características de la figura (incluyendo el lado, el área y el perímetro).
     * Llama al método de la superclase Rectangulo.
     */
    public void caracteristicas(){
        super.caracteristicas();
    }
}
