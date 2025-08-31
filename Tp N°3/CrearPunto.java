
/**
 * Write a description of class CrearPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrearPunto{
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        Punto puntoOrigen = new Punto();
        Punto nuevoPunto = new Punto(x, y);
        puntoOrigen.mostrar();
        nuevoPunto.mostrar();
        
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        Punto nuevoPunto2 = new Punto(x2, y2);
        nuevoPunto2.mostrar();
        System.out.println(nuevoPunto.distanciaA(nuevoPunto2));
    }
}