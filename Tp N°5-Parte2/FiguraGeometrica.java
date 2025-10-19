/**
 * Class FiguraGeometrica.
 * Representa la clase base abstracta para todas las figuras geométricas.
 * Define las propiedades y operaciones comunes, como el origen y la
 * capacidad de calcular la superficie.
 *
 * @author (Escobar Luacas & Fernandez Gabriel) 
 * @version (10/10/2025)
 */
public abstract class FiguraGeometrica{
    private Punto origen;
    
    /**
     * Constructor de la clase FiguraGeometrica.
     * Inicializa la figura con un punto de origen.
     * @param p_origen El objeto Punto que define el origen de la figura.
     */
    public FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }
    
    /**
     * Setter ★ Establece el punto de origen de la figura.
     * @param p_origen El nuevo objeto Punto para el origen.
     */
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    /**
     * Getter ★ Retorna el punto de origen de la figura.
     * @return El objeto Punto que representa el origen.
     */
    public Punto getOrigen(){
        return this.origen;
    }
    
    /**
     * Método abstracto que debe ser implementado por las subclases
     * para retornar el nombre específico de la figura.
     * @return El nombre de la figura (String).
     */
    public abstract String nombreFigura();
    
    /**
     * Método abstracto que debe ser implementado por las subclases
     * para calcular y retornar la superficie de la figura.
     * @return La superficie de la figura (double).
     */
    public abstract double superficie();
    
    /**
     * Muestra en pantalla el cálculo de la superficie de la figura.
     */
    public void mostrarSuperficie(){
        System.out.println("Superficie: " + this.superficie());
    }
}
