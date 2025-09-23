/**
 * Class Punto.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Punto
{
    private double x;
    private double y;
    /**
     * ★ Constructor de objeto de clase Punto
     * @param p_x asigna un valor al punto x.
     * @param p_y asigna un valor al punto y
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    /**
     * Setter ★ Actualiza x en el parametro p_x.
     * @param p_x

     */
        private void setX(double p_x){
        this.x = p_x;
    }
    /**
     *  Setter ★ Actualiza y en el parametro p_y.
     * @param p_y
     */
    private void setY(double p_y){
        this.y = p_y;
    }
     /**
     * Getter ★ retorna el punto x.
     * @return x
     */
    public double getX(){
        return this.x;
    }
     /**
     * Getter ★ retorna el punto Y.
     * @return y.
     */
    public double getY(){
        return this.y;
    }
     /**
     * ★ Constructor de objeto de clase Punto: que cambia en 0 los puntos X e U.
     */
    public Punto(){
        this.setX(0.0);
        this.setY(0.0);
    }
    /**
     * Desplaza los puntos X e Y.
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    /**
     * Devuelve la distancia entre dos puntos.
     */
    public double distanciaA(Punto p_ptoDistante){
        double dx = getX() - p_ptoDistante.getX();
        double dy = getY() - p_ptoDistante.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    /**
     * Muestra en pantalla los puntos cardinales X e Y.
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + "," + "Y: " + this.getY());
    }
    /**
     * metodo que muestra en pantalla las coordenadas
     * @return concatenación de cadena que recibe los puntos x e y.
     */
    public String coordenadas(){
        return "(" + this.getX() + ", " + " " + this.getY() + ")";
    }
}