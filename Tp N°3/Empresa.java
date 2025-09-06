/**
 * Class ejecutale Empresa.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
import java.util.Scanner;
import java.util.*;
public class Empresa{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el Cuil: ");
        long cuil = scanner.nextInt();
        System.out.println("Ingrese el Apellido: ");
        String ape = scanner.next();
        System.out.println("Ingrese el Nombre: ");
        String nom = scanner.next();
        System.out.println("Ingrese el Sueldo Basico: ");
        double sueldo = scanner.nextDouble();
    
        System.out.println("Ingrese el año de ingreso: ");
        int anio = scanner.nextInt();
        System.out.println("Ingrese el Mes de ingreso(1-12): ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el dia de ingreso: ");
        int dia = scanner.nextInt();
        Calendar fechaIngreso = new GregorianCalendar(anio, mes - 1,dia);
        
        Empleado empleado1 = new Empleado(cuil, ape, nom, sueldo, fechaIngreso);
        
        empleado1.mostrar();
        
        if (empleado1.esAniversario() == true){
            System.out.println("Puedes retirarte 1 Hora mas temprano");
        }
        
        EmpleadoConJefe empleado1ConJefe = new EmpleadoConJefe(cuil, ape, nom, sueldo, fechaIngreso);
        
        empleado1ConJefe.mostrarPantalla();
        
        EmpleadoConJefe jefe = new EmpleadoConJefe(2046240424, "Escobar", "Lucas", 100000, 2000);
        
        EmpleadoConJefe empleado2ConJefe = new EmpleadoConJefe(cuil, ape, nom, sueldo, fechaIngreso, jefe);
        
        empleado2ConJefe.mostrarPantalla();        
    }
}
