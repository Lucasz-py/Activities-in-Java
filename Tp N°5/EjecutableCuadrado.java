
/**
 * Write a description of class EjecutableCuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjecutableCuadrado{
    public static void main(String[] args){
        Punto punto = new Punto(0,0);
        Cuadrado cuadrado = new Cuadrado(punto, 12);
        Rectangulo rec = new Rectangulo(punto, 10, 15);
        Rectangulo rec2 = new Rectangulo(punto, 10, 10);
        
        cuadrado.caracteristicas();
        rec.caracteristicas();
        rec2.caracteristicas();
    }
}