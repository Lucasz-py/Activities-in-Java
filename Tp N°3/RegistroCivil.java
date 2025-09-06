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
    
        System.out.println(">>> Asignamos a hombre1 como esposo de mujer1");
        mujer1.casarseCon(hombre1);
        mujer1.casadaCon();
        mujer1.mostrarEstadoCivil();
        
        System.out.println("- MUJER2 -"+"\n"+"Ingrese el nombre:");
        String nomM2 = scanner.next();
        System.out.println("Ingrese el apellido:");
        String apeM2 = scanner.next();
        System.out.println("Ingrese la edad:");
        int edadM2 = scanner.nextInt();
        
        Mujer mujer2 = new Mujer(nomM2, apeM2, edadM2);
        
        System.out.println("-   HOMBRE2 -"+"\n"+"Ingrese el nombre:");
        String nomH2 = scanner.next();
        System.out.println("Ingrese el apellido:");
        String apeH2 = scanner.next();     
        int edadH2 = scanner.nextInt();
        
        System.out.println(">>> Asignamos mujer2 como esposa a hombre2 con el constructor");
        Hombre hombre2 = new Hombre(nomH2, apeH2, edadH2 , mujer2);
        
        hombre2.casadoCon();
        hombre2.mostrarEstadoCivil();
        
        System.out.println("\n" + ">>> Usamos el metodo divorcio");
        hombre2.divorcio();
        hombre2.mostrarEstadoCivil();
        
    }
}
