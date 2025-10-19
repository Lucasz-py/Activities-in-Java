/**
 * Class ejecutable Banco.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
import java.util.Scanner;
import java.util.*;

public class Banco{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calendar fechaNac = new GregorianCalendar(2004, Calendar.OCTOBER, 27);
        Persona titular = new Persona(46240424, "Lucas", "Escobar", fechaNac);
        
        if (titular.esCumpleanios()){
            System.out.println("Feliz Cumpleaños" + titular.nomYApe());
        }
        
        System.out.println("- Caja de Ahorro -" + "\n" + "Ingrese el nuero de Cuenta: ");
        int nroCAhorro = scanner.nextInt();
        System.out.println("Ingrese el saldo: ");
        double saldoAhorro = scanner.nextDouble();
        
        CajaDeAhorro caja1 = new CajaDeAhorro(nroCAhorro, titular, saldoAhorro);
        
        int opcion;
        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Mostrar cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Extraer");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
        
            switch (opcion) {
                case 1:
                    caja1.mostrar();
                    break;
                case 2:
                    System.out.print("Ingrese monto a DEPOSITAR: ");
                    double importeDeposito = scanner.nextDouble();
                    caja1.depositar(importeDeposito);
                    break;
                case 3:
                    System.out.print("Ingrese monto a EXTRAER: ");
                    double importeExtraccion = scanner.nextDouble();
                    caja1.extraer(importeExtraccion);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                }
            } while (opcion != 0);
    

        System.out.println("- Cuenta Corriente-" + "\n" + "Ingrese el numero de Cuenta:");
        int nroCuenta = scanner.nextInt();
        System.out.println("Ingrese el saldo: ");
        double saldoCuenta = scanner.nextDouble();
        
        CuentaCorriente cuenta1 = new CuentaCorriente(nroCuenta, titular, saldoCuenta);
        
        int opcion2;
        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Mostrar cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Extraer");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion2 = scanner.nextInt();
        
            switch (opcion2) {
                case 1:
                    cuenta1.mostrar();
                    break;
                case 2:
                    System.out.print("Ingrese monto a DEPOSITAR: ");
                    double importeDeposito2 = scanner.nextDouble();
                    cuenta1.depositar(importeDeposito2);
                    break;
                case 3:
                    System.out.print("Ingrese monto a EXTRAER: ");
                    double importeExtraccion2 = scanner.nextDouble();
                    cuenta1.extraer(importeExtraccion2);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                }
            } while (opcion2 != 0);
        }
}