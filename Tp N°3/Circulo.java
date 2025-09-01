/**
 * Class Circulo.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Circulo{
    private double radio;
    private Punto centro;
     /**
     * Constructor de Circulo
     * @param p_radio asigna el valor del radio.
     * @param p_centro asigna el obejo de clase Punto.
     */
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
     /**
     * Constructor de Circulo sin parametro.
     */
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto(0, 0));
    }
    
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    private void setCentro(Punto p_centro){
        this.centro  = p_centro;
    }
    
    public double getRadio(){
        return radio;
    }
    public Punto getCentro(){
        return centro;
    }
    /**
    * Método desplazar
    * @param p_dx valor a desplazar en x.
    * @param p_dy valor a desplazar en y.
    * desplza el rectangulo segun los valores de los parametros.
    */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    /**
    * Método perimetro
    * Devuelve el resultado de calcular el perimetro del circulo.
    */     
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    /**
    * Método superficie
    * Devuelve el resultado de calcular el superficie del circulo.
    */ 
    public double superficie(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
    /**
    * Método perimetro
    * Imprime en pantalla el circulo, su centro, radio, perimtro y superficie.
    */
    public void caracteristicas(){
        System.out.println("******Circulo******");
        System.out.println("Centro: " + this.getCentro().coordenadas() + " -Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " -Perimetro: " + this.perimetro());
        System.out.print("\n");
    }
    /**
    * Método distanciaA
    * @param otroCirculo objeto de clase Circulo.
    * devuelve cuanto es la distania entre dos objetos de clase Ciruclo.
    */
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    /**
    * Método elMayor
    * @param otroCirculo objeto de clase Circulo.
    * Compara dos objetos de Clase Circulo y devuelve el mayor.
    */
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() >= otroCirculo.superficie()){
            return this;
        } else {
            return otroCirculo;
        }
    }
}