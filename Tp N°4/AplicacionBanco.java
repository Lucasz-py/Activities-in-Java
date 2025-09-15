import java.util.Scanner;
/**
 * Write a description of class AplicacionBanco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AplicacionBanco{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Banco miBanco = new Banco("")
        ,
        int opcion;

        do{
            System.out.println("\n---Menu----");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. mostrar lista de empleados");
            System.out.println("3. Mostrar");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                System.out.println("--Agregar Empleado--");
                System.out.println("Cuil:");
                long cuil = scanner.nextLong();
                System.out.println("Apellido:");
                String ape = scanner.next();
                System.out.println("Nombre:");
                String nom = scanner.next();
                System.out.println("Sueldo Basico:");
                double sueldoBasico = scanner.nextDouble();
                System.out.println("Año ingreso:");
                int anio = scanner.nextInt();
                
                Empleado empleado = new Empelado(cuil, ape, nom, sueldoBasico, anio);
                
            }
        }
    }
}