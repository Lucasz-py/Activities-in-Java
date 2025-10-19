/**
 * Class Rectangulo.
 * Representa una figura geométrica rectangular, definida por su origen (esquina superior izquierda), 
 * ancho y alto. También puede representar un cuadrado si el ancho es igual al alto.
 * Hereda de la clase abstracta FiguraGeometrica.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Rectangulo extends FiguraGeometrica{
    private double ancho; // El ancho del rectángulo.
    private double alto;  // El alto (altura) del rectángulo.
    
    /**
     * ★ Constructor de objeto de clase Rectangulo.
     * Inicializa el rectángulo con un origen, ancho y alto específicos.
     * @param p_origen asigna un objeto de la clase Punto que representa la esquina de origen.
     * @param p_ancho asigna el ancho del rectangulo.
     * @param p_alto asigna el alto del rectangulo.
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        super(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /**
     * ★ Constructor de objeto de clase Rectangulo.
     * Inicializa el rectángulo con origen en (0, 0), y ancho y alto específicos.
     * @param p_ancho asigna el ancho del rectangulo.
     * @param p_alto asigna el alto del rectangulo.
     */
    public Rectangulo(double p_ancho, double p_alto){
        super(new Punto(0,0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    /**
     * Setter ★ Actualiza el ancho del rectángulo.
     * @param p_ancho El nuevo valor para el ancho.
     */
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    /**
     * Setter ★ Actualiza el alto del rectángulo.
     * @param p_alto El nuevo valor para el alto.
     */
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    /**
     * Getter ★ Devuelve el ancho del rectángulo.
     * @return El ancho actual (double).
     */
    public double getAncho(){
        return ancho;
    }
    
    /**
     * Getter ★ Devuelve el alto del rectángulo.
     * @return El alto actual (double).
     */
    public double getAlto(){
        return alto;
    }
    
    /**
     * Desplaza el origen del rectángulo según los valores de los parámetros.
     * @param p_dx valor a desplazar en el eje X.
     * @param p_dy valor a desplazar en el eje Y.
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    
    /**
     * Calcula el perímetro del rectángulo.
     * @return El resultado de calcular el perímetro: $2 \cdot (\text{ancho} + \text{alto})$ (double).
     */
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }
    
    /**
     * Calcula la superficie del rectángulo.
     * @return El resultado de calcular la superficie: $\text{ancho} \cdot \text{alto}$ (double).
     */
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }
    
    /**
     * Muestra en pantalla el nombre de la figura, sus dimensiones (origen, alto, ancho/lado),
     * superficie y perímetro.
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        if(this.getAncho() == this.getAlto()){
            System.out.println("Origen: "+this.getOrigen().coordenadas()+ " - Lado: "+this.getAlto());
        } else {
            System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());    
        }
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
        System.out.print("\n");
    }
    
    /**
     * Calcula la distancia entre los orígenes de dos objetos Rectangulo.
     * @param otroRectangulo El objeto de clase Rectangulo con el que se calculará la distancia.
     * @return La distancia euclidiana entre los orígenes (double).
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    
    /**
     * Compara dos objetos de clase Rectangulo basándose en su superficie y devuelve el de mayor área.
     * Si las superficies son iguales, devuelve el rectángulo actual (`this`).
     * @param otroRectangulo El objeto de clase Rectangulo a comparar.
     * @return El objeto Rectangulo con la mayor superficie.
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if (this.superficie() >= otroRectangulo.superficie()){
            return this;            
        } else {
            return otroRectangulo;
        }
    }
    
    /**
     * Retorna el nombre de la figura, determinando si es un "Cuadrado" o un "Rectangulo"
     * basándose en la igualdad de sus lados.
     * @return El nombre "***** Cuadrado *****" o "***** Rectangulo *****" (String).
     */
    public String nombreFigura(){
        if(this.getAncho() == this.getAlto()){
            return "***** Cuadrado *****";
        } else {
            return "***** Rectangulo *****";
        }
    }
}
