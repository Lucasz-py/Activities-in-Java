import java.util.Scanner;
/**
 * Class ejecutable RegistroCivil.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */

public class RegistroCivil{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("- MUJER -"+"\n"+"Ingrese el nombre:");
        String nomM = scanner.next();
        System.out.println("Ingrese el apellido:");
        String apeM = scanner.next();
        System.out.println("Ingrese la edad:");
        int edadM = scanner.nextInt();
        
        Mujer mujer1 = new Mujer(nomM, apeM, edadM);
        
        System.out.println("-   HOMBRE -"+"\n"+"Ingrese el nombre:");
        String nomH = scanner.next();
        System.out.println("Ingrese el apellido:");
        String apeH = scanner.next();
        System.out.println("Ingrese la edad:");
        int edadH = scanner.nextInt();

        
        Hombre hombre1 = new Hombre(nomH, apeH, edadH);
        
        System.out.println(mujer1.datos());
        System.out.println(hombre1.datos());
        mujer1.mostrarEstadoCivil();
        hombre1.mostrarEstadoCivil();
        
        mujer1.casarseCon(hombre1);
        mujer1.casadaCon();
    }
}
