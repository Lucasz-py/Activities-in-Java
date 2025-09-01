
/**
 * Class ejecutable CrearFigura.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
import java.util.Random;
import java.util.Scanner;

public class CrearFigura{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Creacion de Circulos
        System.out.println("Ingrese un punto x: ");
        double x = scanner.nextDouble();
        System.out.println("Ingrese un punto y: ");
        double y = scanner.nextDouble();
        Punto p1 = new Punto(x, y);
        
        System.out.println("Ingrese el radio: ");
        double r = scanner.nextDouble();
        
        Circulo circulo1 = new Circulo(r, p1);
        System.out.println(">>> Circulo de ejemplo usando Scanner");
        circulo1.caracteristicas();
        
        Punto puntoCero = new Punto(0, 0);
        Random unNumero = new Random();
        double radio = unNumero.nextDouble() * 100.0;
        
        Circulo c2 = new Circulo(radio, puntoCero);
        
        c2.desplazar(-240, -230);
        System.out.println(">>> Circulo 1 desplazado");
        c2.caracteristicas();
    
        Punto p2 = new Punto(5.2, 0.5);
        double radio2 = unNumero.nextDouble() * 100.0;
        
        Circulo c3 = new Circulo(radio2, p2);
        System.out.println(">>> Circulo 2");
        c2.caracteristicas();
        
        System.out.println(">>> El Mayor");
        c3.elMayor(c2).caracteristicas();
        
        System.out.println("Distancia: " + c2.distanciaA(c3));
        
        //Creacion de Rectangulos
        System.out.println("Ingrese el Ancho: ");
        double ancho = scanner.nextDouble();
        System.out.println("Ingrese el Alto: ");
        double alto = scanner.nextDouble();
        
        Rectangulo recEjemplo = new Rectangulo(ancho, alto);
        System.out.println(">>> Rectangulo de ejemplo usando Scanner");
        recEjemplo.caracteristicas();
        
        double anchoRandom = unNumero.nextDouble() * 100.0;
        double altoRandom = unNumero.nextDouble() * 100.0;
        
        Rectangulo recRandom = new Rectangulo(anchoRandom, altoRandom);
        System.out.println(">>> Rectangulo random 1");
        recRandom.caracteristicas();
        
        recRandom.desplazar(40, -20);
        System.out.println(">>> Rectangulo random 1 desplazado");
        recRandom.caracteristicas();
        
        Punto pr = new Punto(7.4, 4.5);
        double anchoR2 = unNumero.nextDouble() * 100.0;
        double altoR2 = unNumero.nextDouble() * 100.0;
        
        System.out.println(">>> Rectangulo random 2");
        Rectangulo recRandom2 = new Rectangulo(pr, anchoR2, altoR2);
        recRandom2.caracteristicas();
        
        System.out.println(">>> El Mayor");
        recRandom.elMayor(recRandom2).caracteristicas();
        
        
        
        
        
        
        
        
        
        
        
        
    }
}