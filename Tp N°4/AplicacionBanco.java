import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class AplicacionBanco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AplicacionBanco{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        //Solicitud de datos de banco
        System.out.println("Nombre de banco: "); // solicita nombre de banco
        String nombreBanco = scanner.next();
        System.out.println("Num de sucursal: "); //solicitar número de sucursal
        int numSucursal = scanner.nextInt();
        //Solicitud de datos de localidad del empleado
        System.out.println("Localidad: ");
        String nombreLocalidad = scanner.next();
        System.out.println("Provincia: ");
        String nombreProvincia = scanner.next();
        //Crea localidad
        Localidad localidadEmpleado = new Localidad(nombreLocalidad, nombreProvincia);
        //Crea el objeto Mibanco
        Banco miBanco = new Banco(nombreBanco, localidadEmpleado,numSucursal, new ArrayList<Empleado>());
        //Banco miBanco = new Banco(nombreBanco, numSucursal, new ArrayList<Empleado>());
        
        do{
            System.out.println("\n---Menu----");
            System.out.println("1. Contratar empleado ");
            System.out.println("2. Mostrar lista de empleados ");
            System.out.println("3. Mostrar ");
            System.out.println("4. Despedir empleado");
            System.out.println("0. Salir ");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                case 1:
                //Agregar empleado
                System.out.println("--Agregar Empleado--");
                System.out.println("\t");
                System.out.println("Cuil: ");
                long cuil = scanner.nextLong();
                System.out.println("Apellido: ");
                String ape = scanner.next();
                System.out.println("Nombre: ");
                String nom = scanner.next();
                System.out.println("Sueldo Basico: ");
                double sueldoBasico = scanner.nextDouble();
                System.out.println("Año ingreso: ");
                int anio = scanner.nextInt();
                
                Empleado empleado = new Empleado(cuil, ape, nom, sueldoBasico, anio);
                
                miBanco.agregarEmpleado(empleado);
                
                break;
                
                case 2:
                miBanco.listarSueldos();
                break;
                
                case 3:
                miBanco.mostrar();
                break;
                
                case 4:
                System.out.println("--Despedir Empleado--");
                System.out.println("Ingrese el CUIL del empleado a despedir: ");
                long cuilEliminar = scanner.nextLong();
                
                Empleado empleadoAEliminar = null;
                for (Empleado emp : miBanco.getEmpleado()) {
                if (emp.getCuil() == cuilEliminar) {
                    empleadoAEliminar = emp;
                    break;
                    }
                }
                
                if (empleadoAEliminar != null) {
                boolean eliminado = miBanco.quitarEmpleado(empleadoAEliminar);
                if (eliminado) {
                    System.out.println("Empleado eliminado exitosamente.");
                } else {
                    System.out.println("No se puede eliminar. El banco debe tener al menos 1 empleado.");
                }
                } else {
                    System.out.println("No se encontró ningún empleado con ese CUIL.");
                }
            break;        
            }
        }while(opcion != 0);
    }
}