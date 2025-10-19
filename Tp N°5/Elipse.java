/**
 * Clase Elipse.
 * Representa una figura elíptica definida por sus dos semiejes y su punto central.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elipse{
    private double sEjeMayor; // Longitud del semieje mayor de la elipse.
    private double sEjeMenor; // Longitud del semieje menor de la elipse.
    private Punto centro; // Coordenadas del centro de la elipse.
    
    /**
     * Constructor de la clase Elipse.
     * @param p_sEjeMayor Longitud del semieje mayor (double).
     * @param p_sEjeMenor Longitud del semieje menor (double).
     * @param p_centro Punto que define el centro de la elipse (Punto).
     */
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro){
        this.setSEjeMayor(p_sEjeMayor);
        this.setSEjeMenor(p_sEjeMenor);
        this.setCentro(p_centro);
    }
    
    /**
     * Establece la longitud del semieje mayor.
     * @param p_sEjeMayor Longitud del semieje mayor (double).
     */
    private void setSEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }
    
    /**
     * Establece la longitud del semieje menor.
     * @param p_sEjeMenor Longitud del semieje menor (double).
     */
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }
    
    /**
     * Establece el punto central de la elipse.
     * @param p_centro El punto central (Punto).
     */
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    /**
     * Obtiene la longitud del semieje mayor.
     * @return Longitud del semieje mayor (double).
     */
    public double getSEjeMayor(){
        return this.sEjeMayor;
    }
    
    /**
     * Obtiene la longitud del semieje menor.
     * @return Longitud del semieje menor (double).
     */
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    
    /**
     * Obtiene el punto central de la elipse.
     * @return El punto central (Punto).
     */
    public Punto getCentro(){
        return this.centro;
    }
    
    /**
     * Devuelve el nombre de la figura.
     * @return El nombre de la figura, formateado como "****Elipse****" (String).
     */
    public String nombreFigura(){
        return "****Elipse****";
    }
    
    /**
     * Desplaza el centro de la elipse.
     * Llama al método desplazar del objeto Punto asociado al centro.
     * @param p_dx Desplazamiento en el eje X (double).
     * @param p_dy Desplazamiento en el eje Y (double).
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
     * Calcula la superficie (área) de la elipse.
     * La fórmula es $Pi \times \text{semiejeMayor} \times \text{semiejeMenor}$.
     * @return La superficie de la elipse (double).
     */
    public double superficie(){
        return (Math.PI * this.getSEjeMayor() * this.getSEjeMenor());
    }
    
    /**
     * Muestra por consola las características de la elipse: centro, semiejes y superficie.
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + this.getCentro().coordenadas()+" - Semieje Mayor: "+this.getSEjeMayor()+" - Semieje Menor: "+this.getSEjeMenor());
        System.out.println("Superficie: " + this.superficie());
        System.out.print("\n");
    }
    
    /**
     * Calcula la distancia entre el centro de esta elipse y el centro de otra elipse dada.
     * @param otroElipse La otra elipse con la que se quiere calcular la distancia.
     * @return La distancia entre los centros (double).
     */
    public double distanciaA(Elipse otroElipse){
        return this.getCentro().distanciaA(otroElipse.getCentro());
    }

    /**
     * Compara esta elipse con otra y devuelve la elipse con la mayor superficie.
     * Si las superficies son iguales, devuelve esta elipse (`this`).
     * @param otroElipse La otra elipse a comparar.
     * @return La elipse con mayor superficie (Elipse).
     */
    public Elipse elMayor(Elipse otroElipse){
        if(this.superficie() >= otroElipse.superficie()){
            return this;
        } else {
            return otroElipse;
        }
    }
}
