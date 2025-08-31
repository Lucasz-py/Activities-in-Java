import java.util.Scanner;
/**
 * Ejecutable de la clase Empleado.
 * 
 * @authors (Gabriel F. - Lucas E.) 
 * @version (13/08/2025)
 */
public class EjecutableEmpleado
{
  public static void main(String []args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Ingrese CUIL: ");
      long cuil = scanner.nextLong();
      
      System.out.println("Ingrese Apellido: ");
      String apellido = scanner.next();
      scanner.nextLine();
      
      System.out.println("Ingrese Nombre: ");
      String nombre = scanner.next();
      scanner.nextLine();
      
      System.out.println("Ingrese sueldo básico: ");
      double sueldoBasico = scanner.nextDouble();
      
      System.out.println("Ingrese año de ingreso: ");
      int anioIngreso = scanner.nextInt();
      
      Empleado nuevoEmpleado = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
      nuevoEmpleado.mostrar();
      System.out.println(nuevoEmpleado.mostrarLinea());
  }
}