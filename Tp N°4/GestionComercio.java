import java.util.*;

/**
 * Class GestionComercio - Clase ejecutable con menú interactivo
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (20/09/2025)
 */
public class GestionComercio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comercio comercio = new Comercio("Avanti SRL");
        
        // Crear algunos empleados de ejemplo (sin Scanner)
        Empleado empleado1 = new Empleado(30100623L, "Gonzalez", "Juan", 120000.0, 2020);
        Empleado empleado2 = new Empleado(37045987L, "Martinez", "Mercedes", 115000.0, 2019);
        Empleado empleado3 = new Empleado(32550096L, "Gomez", "Virginia", 160000.0, 2018);
        
        // Agregar empleados de ejemplo
        comercio.altaEmpleado(empleado1);
        comercio.altaEmpleado(empleado2);
        comercio.altaEmpleado(empleado3);
        
        int opcion;
        
        do {
            System.out.println("\n=== MENÚ GESTIÓN COMERCIO ===");
            System.out.println("1. Alta de empleado");
            System.out.println("2. Baja de empleado");
            System.out.println("3. Cantidad de empleados");
            System.out.println("4. Verificar si es empleado");
            System.out.println("5. Buscar empleado");
            System.out.println("6. Mostrar sueldo neto");
            System.out.println("7. Emitir nómina");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch(opcion) {
                case 1:
                    System.out.println("\n--- ALTA DE EMPLEADO ---");
                    System.out.print("CUIL: ");
                    long cuilAlta = scanner.nextLong();
                    scanner.nextLine();
                    
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    
                    System.out.print("Sueldo básico: ");
                    double sueldo = scanner.nextDouble();
                    
                    System.out.print("Año de ingreso: ");
                    int anio = scanner.nextInt();
                    
                    Empleado nuevoEmpleado = new Empleado(cuilAlta, apellido, nombre, sueldo, anio);
                    comercio.altaEmpleado(nuevoEmpleado);
                    
                    System.out.println("Empleado agregado exitosamente: " + nombre + " " + apellido);
                    break;
                    
                case 2:
                    System.out.println("\n--- BAJA DE EMPLEADO ---");
                    System.out.print("Ingrese CUIL del empleado a despedir: ");
                    long cuilBaja = scanner.nextLong();
                    
                    Empleado empleadoDespedido = comercio.bajaEmpleado(cuilBaja);
                    if (empleadoDespedido != null) {
                        System.out.println("Empleado despedido: " + empleadoDespedido.apeYNom());
                    } else {
                        System.out.println("No se encontró empleado con CUIL: " + cuilBaja);
                    }
                    break;
                    
                case 3:
                    System.out.println("\n--- CANTIDAD DE EMPLEADOS ---");
                    System.out.println("Cantidad de empleados: " + comercio.cantidadDeEmpleados());
                    break;
                    
                case 4:
                    System.out.println("\n--- VERIFICAR EMPLEADO ---");
                    System.out.print("Ingrese CUIL a verificar: ");
                    long cuilVerificar = scanner.nextLong();
                    
                    if (comercio.esEmpleado(cuilVerificar)) {
                        System.out.println("SÍ es empleado del comercio");
                    } else {
                        System.out.println("NO es empleado del comercio");
                    }
                    break;
                    
                case 5:
                    System.out.println("\n--- BUSCAR EMPLEADO ---");
                    System.out.print("Ingrese CUIL a buscar: ");
                    long cuilBuscar = scanner.nextLong();
                    
                    Empleado empleado = comercio.buscarEmpleado(cuilBuscar);
                    if (empleado != null) {
                        System.out.println("Empleado encontrado:");
                        empleado.mostrar();
                    } else {
                        System.out.println("No se encontró empleado con CUIL: " + cuilBuscar);
                    }
                    break;
                    
                case 6:
                    System.out.println("\n--- SUELDO NETO ---");
                    System.out.print("Ingrese CUIL del empleado: ");
                    long cuilSueldo = scanner.nextLong();
                    
                    Empleado empSueldo = comercio.buscarEmpleado(cuilSueldo);
                    if (empSueldo != null) {
                        System.out.println("Sueldo neto de " + empSueldo.apeYNom() + ": $" + empSueldo.sueldoNeto());
                    } else {
                        System.out.println("No se encontró empleado con CUIL: " + cuilSueldo);
                    }
                    break;
                    
                case 7:
                    System.out.println("\n--- NÓMINA AFIP ---");
                    comercio.nomina();
                    break;
                    
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción inválida");
            }
            
        } while(opcion != 0);
        
        scanner.close();
    }
}