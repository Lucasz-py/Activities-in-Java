
/**
 * Class ejecutable GestionHospital.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
import java.util.Scanner;

public class GestionHospital{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese Historia Clinica:");
    int hc = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Ingrese el nombre del paciente: ");
    String nomPaciente = scanner.nextLine();
    System.out.println("Ingrese el domicilio del paciente: ");
    String domPaciente = scanner.nextLine();
    
    System.out.println("Ingrese la localidad de nacimiento del paciente: ");
    String loc = scanner.nextLine();
    System.out.println("Ingrese la provincia de nacimiento del paciente:");
    String prov = scanner.nextLine();
    System.out.println("Ingrese la localidad donde vive del paciente: ");
    String locVive = scanner.nextLine();
    System.out.println("Ingrese la provincia donve vive del paciente:");
    String provVive = scanner.nextLine();
    
    System.out.println("Ingrese el nombre del hospital: ");
    String nomHospital = scanner.nextLine();
    System.out.println("Ingrese el nombre del director del hospital");
    String nomDirector = scanner.nextLine();
    
    Localidad localidad = new Localidad(loc, prov);
    Localidad localidadVive = new Localidad(locVive, provVive);
    Paciente paciente = new Paciente(hc, nomPaciente, domPaciente, localidad, localidadVive);
    Hospital hospital = new Hospital(nomHospital, nomDirector);
    
    System.out.println(localidadVive.mostrar());
    
    System.out.println("\n"+"\n");
    
    paciente.mostrarDatosPantalla();
    
    System.out.println("\n"+"\n");
    
    System.out.println(paciente.cadenaDeDatos());
    
    System.out.println("\n"+"\n");
    
    hospital.consultaDatosFiliatorios(paciente);
    
    }
}