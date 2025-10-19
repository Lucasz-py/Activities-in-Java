/**
 * Class Cuadrado.
 * Representa una figura geométrica de tipo cuadrado.
 * Hereda de Rectangulo y asegura que el ancho y el alto sean siempre iguales al valor del lado.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Cuadrado extends Rectangulo{
    
    /**
     * Constructor de objeto de clase Cuadrado.
     * Llama al constructor de la superclase (Rectangulo) usando el mismo valor para ancho y alto.
     * @param p_punto Objeto de clase Punto que representa el origen del cuadrado.
     * @param p_lado El valor del lado del cuadrado.
     */
    public Cuadrado(Punto p_punto, double p_lado){
        super(p_punto, p_lado, p_lado);
    }
    
    /**
     * Retorna el nombre de la figura, aprovechando la lógica ya implementada en la superclase.
     * @return El nombre "***** Cuadrado *****".
     */
    public String nombreFigura(){
        return super.nombreFigura();
    }
    
    /**
     * Muestra las características del cuadrado (origen, lado, superficie y perímetro),
     * aprovechando la implementación de la superclase Rectangulo.
     */
    public void caracteristicas(){
        super.caracteristicas();
    }
}
