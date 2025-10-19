/**
 * Class Elipse.
 * Representa una figura geométrica de tipo elipse, definida por sus
 * semiejes mayor y menor. Hereda de la clase abstracta FiguraGeometrica.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Elipse extends FiguraGeometrica{
    private double sEjeMayor;
    private double sEjeMenor;
    
    /**
     * Constructor de la clase Elipse.
     * Inicializa la elipse con sus semiejes y el punto de centro,
     * llamando al constructor de la superclase (FiguraGeometrica) para el centro.
     * @param p_sEjeMayor El valor del semieje mayor de la elipse.
     * @param p_sEjeMenor El valor del semieje menor de la elipse.
     * @param p_centro El objeto Punto que representa el centro de la elipse.
     */
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro){
        super(p_centro);
        this.setSEjeMayor(p_sEjeMayor);
        this.setSEjeMenor(p_sEjeMenor);
    }
    
    /**
     * Setter ★ Establece el semieje mayor de la elipse.
     * @param p_sEjeMayor El nuevo valor para el semieje mayor.
     */
    private void setSEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }
    
    /**
     * Setter ★ Establece el semieje menor de la elipse.
     * @param p_sEjeMenor El nuevo valor para el semieje menor.
     */
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }
    
    /**
     * Getter ★ Retorna el semieje mayor de la elipse.
     * @return El valor actual del semieje mayor (double).
     */
    public double getSEjeMayor(){
        return this.sEjeMayor;
    }
    
    /**
     * Getter ★ Retorna el semieje menor de la elipse.
     * @return El valor actual del semieje menor (double).
     */
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    
    /**
     * Retorna el centro de la elipse (que es el origen heredado de FiguraGeometrica).
     * @return El objeto Punto que representa el centro.
     */
    public Punto getCentro(){
        return super.getOrigen();
    }
    
    /**
     * Retorna el nombre específico de esta figura.
     * @return El nombre "****Elipse****".
     */
    public String nombreFigura(){
        return "****Elipse****";
    }
    
    /**
     * Desplaza el centro de la elipse sumando los valores p_dx y p_dy.
     * @param p_dx Desplazamiento en el eje X.
     * @param p_dy Desplazamiento en el eje Y.
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
     * Calcula la superficie de la elipse usando la fórmula $\pi \cdot \text{Semieje Mayor} \cdot \text{Semieje Menor}$.
     * @return La superficie calculada (double).
     */
    public double superficie(){
        return (Math.PI * this.getSEjeMayor() * this.getSEjeMenor());
    }
    
    /**
     * Muestra las características de la elipse en consola, incluyendo
     * nombre, centro, semiejes y superficie.
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + this.getCentro().coordenadas()+" - Semieje Mayor: "+this.getSEjeMayor()+" - Semieje Menor: "+this.getSEjeMenor());
        System.out.println("Superficie: " + this.superficie());
        System.out.print("\n");
    }
    
    /**
     * Calcula la distancia entre el centro de esta elipse y el centro de otra elipse.
     * @param otroElipse El objeto Elipse con el que se calculará la distancia.
     * @return La distancia entre los centros (double).
     */
    public double distanciaA(Elipse otroElipse){
        return this.getCentro().distanciaA(otroElipse.getCentro());
    }

    /**
     * Compara esta elipse con otra y devuelve la que tenga mayor superficie.
     * Si las superficies son iguales, devuelve esta elipse.
     * @param otroElipse La otra elipse con la que se comparará.
     * @return El objeto Elipse con la mayor superficie.
     */
    public Elipse elMayor(Elipse otroElipse){
        if(this.superficie() >= otroElipse.superficie()){
            return this;
        } else {
            return otroElipse;
        }
    }
}
