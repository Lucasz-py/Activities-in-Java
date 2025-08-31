
/**
 * Clase ejecutable de la clase Cliente
 * 
 * @authors (Gabriel F. - Lucas E.) 
 * @version (13/08/2025)
 */
public class EjecutableCliente
{
    public static void main(String []args){
        int dni = Integer.parseInt(args[0]);
        String apellido = args[1];
        String nombre = args[2];
        double saldo = Double.parseDouble(args[3]);
        double agregarSaldo = Double.parseDouble(args[4]);
        Cliente newCliente = new Cliente(dni, apellido, nombre, saldo);
        newCliente.mostrar(); 
        newCliente.agregaSaldo(agregarSaldo);
        System.out.println("Importe agregado: " + agregarSaldo); 
        newCliente.mostrar(); 
    }
}