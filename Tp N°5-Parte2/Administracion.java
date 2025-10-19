import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase ejecutable Administración para instanciar figuras y emitir el detalle del jardín.
 * @author (Escobar Luacas & Fernandez Gabriel) 
 * @version (10/10/2025)
 */
public class Administracion {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<FiguraGeometrica> figurasIniciales = new ArrayList<>();
        Jardin miJardin = new Jardin("Bichito de Luz", figurasIniciales);
        
        System.out.println("--- Sistema de Administración de Figuras para Jardín ---");
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione la figura a agregar ('0' para finalizar):");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Círculo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Elipse");
            System.out.print("Opción: ");
            
            String opcion = scanner.next();
            
            if (opcion.equals("0")) {
                continuar = false;
                break;
            }
            
            FiguraGeometrica nuevaFigura = null;
            double x, y;
            
            try {
                System.out.println("Ingrese las coordenadas del punto de origen/centro (X Y):");

                x = scanner.nextDouble();
                y = scanner.nextDouble();
                Punto origen = new Punto(x, y);
                
                switch (opcion) {
                    case "1": // Cuadrado
                        System.out.print("Ingrese el lado: ");
                        double lado = scanner.nextDouble();
                        nuevaFigura = new Cuadrado(origen, lado);
                        break;
                    case "2": // Triangulo
                        System.out.print("Ingrese la base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double altura = scanner.nextDouble();
                        nuevaFigura = new Triangulo(origen, base, altura);
                        break;
                    case "3": // Círculo
                        System.out.print("Ingrese el radio: ");
                        double radio = scanner.nextDouble();
                        nuevaFigura = new Circulo(radio, origen);
                        break;
                    case "4": // Rectángulo
                        System.out.print("Ingrese el ancho: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Ingrese el alto: ");
                        double alto = scanner.nextDouble();
                        nuevaFigura = new Rectangulo(origen, ancho, alto);
                        break;
                    case "5": // Elipse
                        System.out.print("Ingrese el semieje mayor: ");
                        double sEjeMayor = scanner.nextDouble();
                        System.out.print("Ingrese el semieje menor: ");
                        double sEjeMenor = scanner.nextDouble();
                        nuevaFigura = new Elipse(sEjeMayor, sEjeMenor, origen);
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        continue;
                }
                
                if (nuevaFigura != null) {
                    if (miJardin.agregarFigura(nuevaFigura)) {
                        System.out.println(nuevaFigura.nombreFigura() + " agregado correctamente.");
                    }
                }
                
                } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Asegúrese de ingresar números válidos para las dimensiones y coordenadas.");
                scanner.nextLine(); 
                } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado al procesar la figura.");
            }
        }
        
        System.out.println("\n--- Detalle Final del Jardín ---");
        if (miJardin.getFigura().isEmpty()) {
             System.out.println("No se agregaron figuras para el presupuesto.");
        } else {
            miJardin.detalleFiguras();
        }
        
        scanner.close();
    }
}