import java.util.Scanner;
/**
 * Class ejecutable Secretaria.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */

public class Secretaria{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del docente: ");
        String nombreDocente = teclado.nextLine();
        System.out.println("Ingrese el Grado: ");
        String grado = teclado.nextLine();
        System.out.println("Ingrese el Sueldo basico: ");
        double sueldoB = teclado.nextDouble();
        System.out.println("Ingrese la asignacion familiar: ");
        double asig  = teclado.nextDouble();
        teclado.nextLine();
        
        Docente doc1 = new Docente(nombreDocente, grado, sueldoB, asig);
        
        System.out.println("Ingrese el nombre de la Escuela: ");
        String nomEscuela = teclado.nextLine();
        System.out.println("Ingrese el domicilio");
        String domicilio = teclado.nextLine();
        System.out.println("Ingrese el nombre del Director: ");
        String nomDirector = teclado.nextLine();
        
        Escuela escuela1 = new Escuela(nomEscuela, domicilio, nomDirector);
        
        escuela1.imprimirRecibo(doc1);
        
    }
}
