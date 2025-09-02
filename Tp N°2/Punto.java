
/**
 * Class punto
 * 
 * @authors (Gabriel F. - Lucas E.) 
 * @version (14/08/2025)
 */
public class Punto
{
    private double x;
    private double y;
    /**
     * Constructor de Punto
     * @param p_x asigna un valor al punto x.
     * @param p_y asigna un valor al punto y
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
     /**
      * Método setter
     * @param p_x
     * actualiza x en el parametro p_x
     */
        private void setX(double p_x){
        this.x = p_x;
    }
     /**
      * Método setter
     * @param p_y
     * actualiza y en el parametro p_y
     */
    private void setY(double p_y){
        this.y = p_y;
    }
     /**
     * Getter que retorna el punto x.
     */
    public double getX(){
        return this.x;
    }
     /**
     * Getter que retorna el punto Y.
     */
    public double getY(){
        return this.y;
    }
     /**
     * El método que cambia en 0 los puntos x e y.
     */
    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    /**
     * El método desplaza los puntos x y d.
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    /**
     * el método muestra en pantalla los puntos.
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + "," + "Y: " + this.getY());
    }
    /**
     * metodo que muestra en pantalla las coordenadas
     */
    public String coordenadas(){
        return "(" + this.getX() + ", " + " " + this.getY() + ")";
    }
}