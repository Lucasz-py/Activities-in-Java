import java.util.Scanner;
/**
 * Write a description of class ArrayDePuntos here.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (20/09/2025)
 */
public class ArrayDePuntos{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        Punto[] puntos = new Punto[6];
        
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Ingrese coordenadas del punto " + (i + 1) + ": ");
            System.out.print("X: ");
            double x = scanner.nextDouble();
            System.out.print("Y: ");
            double y = scanner.nextDouble();
            puntos[i] = new Punto(x, y);
        }
        
        System.out.println("\n--- Coordenadas de los puntos ---");
        int contador = 1;
        for (Punto p : puntos) {
            System.out.println("Punto " + contador + ": " + p.coordenadas());
            contador++;
        }
        
        System.out.println("\n--- Distancias entre puntos consecutivos ---");
        for (int i = 0; i < puntos.length - 1; i++) {
            double distancia = puntos[i].distanciaA(puntos[i + 1]);
            System.out.println("Distancia p" + (i + 1) + "-p" + (i + 2) + ": " + distancia);
        }
    }
}

    
