/**
 * Class Rectangulo.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Rectangulo{
    private Punto origen;
    private double ancho;
    private double alto;
    /**
     * Constructor de Rectangulo
     * @param p_origen asigna un objeto del la clase Punto.
     * @param p_ancho asigna el ancho del rectangulo.
     * @param p_alto asigna el alto del rectangulo.
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
     /**
     * Constructor de Rectangulo
     * @param p_ancho asigna el ancho del rectangulo.
     * @param p_alto asigna el alto del rectangulo.
     */
    public Rectangulo(double p_ancho, double p_alto){
        this.setOrigen(new Punto(0, 0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    
    public Punto getOrigen(){
        return origen;
    }
    public double getAncho(){
        return ancho;
    }
    public double getAlto(){
        return alto;
    }
    /**
    * Método desplazar
    * @param p_dx valor a desplazar en x.
    * @param p_dy valor a desplazar en y.
    * desplza el rectangulo segun los valores de los parametros.
    */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    }
    /**
    * Método perimetro
    * Devuelve el resultado de calcular el perimetro del rectangulo.
    */ 
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }
     /**
    * Método superficie
    * Devuelve el resultado de calcular la superficie del rectangulo.
    */
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }
    /**
    * Método perimetro
    * Imprime en pantalla el rectangulo, su origen, alto, ancho, perimtro y superficie.
    */
    public void caracteristicas(){
        System.out.println("******Rectangulo******");
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() + " - Ancho: " + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + " - Perimetro: " + this.perimetro());
        System.out.print("\n");
    }
    /**
    * Método distanciaA
    * @param otroRectangulo objeto de clase Rectangulo.
    * devuelve cuanto es la distania entre dos objetos de clase Rectangulo.
    */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    /**
    * Método elMayor
    * @param otroRectangulo objeto de clase Rectangulo.
    * Compara dos objetos de Clase Rectangulo y devuelve el mayor.
    */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if (this.superficie() >= otroRectangulo.superficie()){
            return this;            
        } else {
            return otroRectangulo;
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    