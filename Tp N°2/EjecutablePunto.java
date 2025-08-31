import java.util.Scanner;
/**
 * Ejecutable Punto.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (14/08/2025)
 */
public class EjecutablePunto
{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número para la abscisa X: ");
        double x = scanner.nextDouble();
        
        System.out.println("Ingrese un número para la ordenada Y: ");
        double y = scanner.nextDouble();
        
        Punto puntoOrigen = new Punto();
        Punto nuevoPunto  = new Punto(x,y);
        System.out.println("Coordenadas punto de origen: " + puntoOrigen.coordenadas());
        nuevoPunto.mostrar();
        System.out.println(nuevoPunto.coordenadas());
    }
}