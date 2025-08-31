
/**
 * Write a description of class CrearCuanta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;

public class CrearCuanta{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el DNI: ");
        int dni = scanner.nextInt();
        System.out.println("Ingrese el Nombre: ");
        String nom = scanner.next();
        System.out.println("Ingrese el Apellido: ");
        String ape = scanner.next();
        
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = scanner.nextInt();
        System.out.println("Ingrese el Mes de nacimiento(1-12): ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el dia de nacimiento: ");
        int dia = scanner.nextInt();
        Calendar fechaNac = new GregorianCalendar(anio, mes - 1,dia);
        
        
        Persona user1 = new Persona(dni, nom, ape, fechaNac);
        Persona user2 = new Persona(dni, nom, ape, anio);
        
        System.out.println("Ingrese el Numero de cuenta: ");
        int nroC = scanner.nextInt();
        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();
        
        CuentaBancaria account1 = new CuentaBancaria(nroC, user1, saldo);
        account1.mostrar();
        
        System.out.println("Cantidad a depositar: ");
        double deposito = scanner.nextDouble();
        account1.depositar(deposito);
        System.out.println(account1.toString());
        
        System.out.println("Cantidad a extraer: ");
        double extraccion = scanner.nextDouble();
        account1.extraer(extraccion);
        System.out.println(account1.toString());
        
    }
}
