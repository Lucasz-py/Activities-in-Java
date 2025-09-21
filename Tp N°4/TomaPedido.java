import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
/**
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (20/09/2025)
 */
public class TomaPedido{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Crear Cliente
        System.out.println("Ingrese el dni del Cliente:");
        int dniC = scanner.nextInt();
        System.out.println("Ingrese el Apellido del Cliente:");
        String apeC = scanner.next();
        System.out.println("Ingrese el Nombre del Cliente:");
        String nomC = scanner.next();
        System.out.println("Ingrese el saldo del cliente:");
        double salC = scanner.nextDouble();
        Cliente cliente1 = new Cliente(dniC, apeC, nomC, salC);
        
        Pedido miPedido = new Pedido(Calendar.getInstance(), cliente1, new ArrayList<Producto>());
        
        int opcion;
        
        do{
            System.out.println("\n---Menu----");
            System.out.println("1. Agregar producto");
            System.out.println("3. Mostrar detalles");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion:");
            opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Codigo:");
                    int cod = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Rubro:");
                    String rub = scanner.nextLine();
                    System.out.println("Descripcion:");
                    String desc = scanner.nextLine();
                    System.out.println("Costo:");
                    double cost = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Nombre Lab:");
                    String nomLab = scanner.nextLine();
                    System.out.println("Direccion Lab");
                    String direLab = scanner.nextLine();
                    System.out.println("Telefono Lab");
                    String telLab = scanner.nextLine();
                    Laboratorio lab = new Laboratorio(nomLab, direLab, telLab);
                    Producto pro = new Producto(cod, rub, desc, cost, lab);
                    
                    miPedido.agregarProducto(pro);
                    break;
                case 3:
                    miPedido.mostrarPedido();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while(opcion != 0);
    }
}