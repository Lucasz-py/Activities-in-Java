import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class AplicacionFacultad here.
 * 
 * @author (Gabriel F. - Lucas E.) 
 * @version ()
 *
 * Clase ejecutable para gestionar una facultad
 */
public class AplicacionFacultad {
    private static Facultad facultad;
    private static ArrayList<Profesor> profesores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        inicializarSistema();
        mostrarMenuPrincipal();
    }
    
    private static void inicializarSistema() {
        System.out.println("=== SISTEMA DE GESTIÓN FACULTAD ===");
        System.out.print("Ingrese el nombre de la facultad: ");
        String nombreFacultad = scanner.nextLine();
        
        facultad = new Facultad(nombreFacultad, profesores);
        System.out.println("Facultad '" + nombreFacultad + "' creada exitosamente!\n");
    }
    
    private static void mostrarMenuPrincipal() {
        int opcion;
        
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Agregar profesor");
            System.out.println("2. Listar todos los profesores");
            System.out.println("3. Mostrar nómina de profesores");
            System.out.println("4. Mostrar detalle de profesores y cargos");
            System.out.println("5. Agregar cargo a profesor");
            System.out.println("6. Quitar profesor");
            System.out.println("7. Buscar profesor por DNI");
            System.out.println("8. Mostrar total a pagar en nómina");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            scanner.nextLine(); // Limpiar buffer
            
            switch(opcion) {
                case 1:
                    agregarProfesor();
                    break;
                case 2:
                    listarProfesores();
                    break;
                case 3:
                    mostrarNomina();
                    break;
                case 4:
                    mostrarDetalleProfesores();
                    break;
                case 5:
                    agregarCargoAProfesor();
                    break;
                case 6:
                    quitarProfesor();
                    break;
                case 7:
                    buscarProfesorPorDNI();
                    break;
                case 8:
                    mostrarTotalPagar();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el sistema! ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while(opcion != 0);
        
        scanner.close();
    }
    
    private static void agregarProfesor() {
        System.out.println("\n--- AGREGAR NUEVO PROFESOR ---");
        
        System.out.print("DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine();
        
        // Verificar si el DNI ya existe
        for(Profesor prof : profesores) {
            if(prof.getDNI() == dni) {
                System.out.println("Error: Ya existe un profesor con DNI " + dni);
                return;
            }
        }
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        
        ArrayList<Cargo> cargos = new ArrayList<>();
        Profesor nuevoProfesor = new Profesor(dni, nombre, apellido, anioNacimiento, titulo, cargos);
        
        if(facultad.agregarProfesor(nuevoProfesor)) {
            System.out.println("✓ Profesor agregado exitosamente!");
        } else {
            System.out.println("✗ Error al agregar profesor.");
        }
    }
    
    private static void listarProfesores() {
        System.out.println("\n--- LISTA DE PROFESORES ---");
        if(profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        
        int contador = 1;
        for(Profesor prof : profesores) {
            System.out.println(contador + ". " + prof.mostrarLinea());
            contador++;
        }
    }
    
    private static void mostrarNomina() {
        System.out.println("\n--- NÓMINA DE PROFESORES ---");
        if(profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        facultad.nominaProfesores();
    }
    
    private static void mostrarDetalleProfesores() {
        System.out.println("\n--- DETALLE DE PROFESORES Y CARGOS ---");
        if(profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        facultad.listarProfesorCargos();
    }
    
    private static void agregarCargoAProfesor() {
        if(profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        
        listarProfesores();
        System.out.print("Seleccione el número del profesor: ");
        int numProfesor = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if(numProfesor < 0 || numProfesor >= profesores.size()) {
            System.out.println("Número de profesor inválido.");
            return;
        }
        
        Profesor profesor = profesores.get(numProfesor);
        
        System.out.println("\n--- TIPOS DE CARGO ---");
        System.out.println("1. Cargo Simple");
        System.out.println("2. Cargo Semiexclusivo");
        System.out.println("3. Cargo Exclusivo");
        System.out.print("Seleccione tipo de cargo: ");
        int tipoCargo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Nombre del cargo: ");
        String nombreCargo = scanner.nextLine();
        
        System.out.print("Sueldo básico: ");
        double sueldo = scanner.nextDouble();
        
        System.out.print("Año de ingreso: ");
        int anioIngreso = scanner.nextInt();
        
        System.out.print("Horas de docencia: ");
        int horasDocencia = scanner.nextInt();
        
        Cargo nuevoCargo = null;
        
        switch(tipoCargo) {
            case 1:
                nuevoCargo = new Cargo(nombreCargo, sueldo, anioIngreso, horasDocencia);
                break;
            case 2:
                System.out.print("Horas de investigación: ");
                int horasInvestigacion = scanner.nextInt();
                nuevoCargo = new SemiExclusivo(nombreCargo, sueldo, anioIngreso, horasDocencia, horasInvestigacion);
                break;
            case 3:
                System.out.print("Horas de investigación: ");
                int horasInv = scanner.nextInt();
                System.out.print("Horas de extensión: ");
                int horasExt = scanner.nextInt();
                nuevoCargo = new Exclusivo(nombreCargo, sueldo, anioIngreso, horasDocencia, horasInv, horasExt);
                break;
            default:
                System.out.println("Tipo de cargo inválido.");
                return;
        }
        
        scanner.nextLine(); // Limpiar buffer
        
        if(profesor.agregarCargo(nuevoCargo)) {
            System.out.println("✓ Cargo agregado exitosamente al profesor!");
        } else {
            System.out.println("✗ Error al agregar cargo.");
        }
    }
    
    private static void quitarProfesor() {
        if(profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        
        listarProfesores();
        System.out.print("Seleccione el número del profesor a eliminar: ");
        int numProfesor = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if(numProfesor < 0 || numProfesor >= profesores.size()) {
            System.out.println("Número de profesor inválido.");
            return;
        }
        
        Profesor profesor = profesores.get(numProfesor);
        
        if(facultad.quitarEmpleado(profesor)) {
            System.out.println("✓ Profesor eliminado exitosamente!");
        } else {
            System.out.println("✗ Error al eliminar profesor. Debe haber al menos 2 profesores para eliminar uno.");
        }
    }
    
    private static void buscarProfesorPorDNI() {
        if(profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        
        System.out.print("Ingrese el DNI del profesor a buscar: ");
        int dniBuscar = scanner.nextInt();
        scanner.nextLine();
        
        boolean encontrado = false;
        for(Profesor prof : profesores) {
            if(prof.getDNI() == dniBuscar) {
                System.out.println("\n--- PROFESOR ENCONTRADO ---");
                prof.mostrar();
                encontrado = true;
                break;
            }
        }
        
        if(!encontrado) {
            System.out.println("No se encontró ningún profesor con DNI: " + dniBuscar);
        }
    }
    
    private static void mostrarTotalPagar() {
        if(profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
            return;
        }
        
        double total = facultad.totalAPagar();
        System.out.println("\n--- TOTAL A PAGAR EN NÓMINA ---");
        System.out.println("Total: $" + total);
        
        // Mostrar desglose por profesor usando for-each
        System.out.println("\nDesglose por profesor:");
        for(Profesor prof : profesores) {
            System.out.println("- " + prof.getNombre() + " " + prof.getApellido() + 
                             ": $" + prof.sueldoTotal());
        }
    }
}