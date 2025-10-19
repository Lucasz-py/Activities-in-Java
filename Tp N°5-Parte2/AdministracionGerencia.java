import java.util.ArrayList;
import java.util.Scanner;

public class AdministracionGerencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear la gerencia
        Gerencia gerencia = new Gerencia("Principal", new ArrayList<Alojamiento>());
        
        int opcion;
        
        do {
            System.out.println("\n=============================================");
            System.out.println("  GERENCIA " + gerencia.getNombre() + " - MENÚ");
            System.out.println("=============================================");
            System.out.println("1. Registrar nuevo Hotel alquilado");
            System.out.println("2. Registrar nueva Cabaña alquilada");
            System.out.println("3. Mostrar Liquidación y Conteo General");
            System.out.println("0. Salir");
            System.out.print(">>> Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarHotel(gerencia);
                    break;
                case 2:
                    registrarCabana(gerencia);
                    break;
                case 3:
                    mostrarLiquidacion(gerencia);
                    break;
                case 0:
                    System.out.println("\n*** Saliendo del sistema de gestión. ***");
                    break;
                default:
                    System.out.println("\n--- Opción no válida. Intente de nuevo. ---");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
    
    private static void registrarHotel(Gerencia gerencia) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- REGISTRAR NUEVO HOTEL ---");
        
        System.out.print("Nombre del hotel: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Precio base por día: ");
        double precioBase = scanner.nextDouble();
        
        System.out.print("Días de alquiler: ");
        int dias = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Tipo de habitación (Single/Doble): ");
        String tipoHabitacion = scanner.nextLine();
        
        ArrayList<Servicio> servicios = solicitarServicios();
        
        Hotel hotel = new Hotel(nombre, precioBase, dias, servicios, tipoHabitacion);
        gerencia.agregarAlojamiento(hotel);
        
        System.out.println("\n*** Hotel registrado exitosamente! ***");
    }
    
    private static void registrarCabana(Gerencia gerencia) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- REGISTRAR NUEVA CABAÑA ---");
        
        System.out.print("Nombre de la cabaña: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Precio base por día: ");
        double precioBase = scanner.nextDouble();
        
        System.out.print("Días de alquiler: ");
        int dias = scanner.nextInt();
        
        System.out.print("Número de habitaciones: ");
        int nroHabitaciones = scanner.nextInt();
        scanner.nextLine();
        
        ArrayList<Servicio> servicios = solicitarServicios();
        
        Cabaña cabaña = new Cabaña(nombre, precioBase, dias, servicios, nroHabitaciones);
        gerencia.agregarAlojamiento(cabaña);
        
        System.out.println("\n*** Cabaña registrada exitosamente! ***");
    }
    
    private static ArrayList<Servicio> solicitarServicios() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Servicio> servicios = new ArrayList<>();
        
        System.out.println("\n--- AGREGAR SERVICIOS ---");
        System.out.print("¿Se utilizaron servicios adicionales? (s/n): ");
        char usarServicios = scanner.nextLine().charAt(0);
        
        if (usarServicios == 's' || usarServicios == 'S') {
            char agregarMas;
            
            do {
                System.out.print("Descripción del servicio: ");
                String descripcion = scanner.nextLine();
                
                System.out.print("Precio del servicio: ");
                double precio = scanner.nextDouble();
                scanner.nextLine();
                
                Servicio servicio = new Servicio(descripcion, precio);
                servicios.add(servicio);
                
                System.out.print("¿Desea agregar otro servicio? (s/n): ");
                agregarMas = scanner.nextLine().charAt(0);
                
            } while (agregarMas == 's' || agregarMas == 'S');
        } else {
            System.out.println("No se agregaron servicios adicionales.");
        }
        
        return servicios;
    }
    
    private static void mostrarLiquidacion(Gerencia gerencia) {
        System.out.println("\n--- LIQUIDACIÓN GENERAL ---");
        gerencia.mostrarLiquidacion();
    }
}