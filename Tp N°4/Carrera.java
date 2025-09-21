import java.util.Scanner;
import java.util.HashMap;
/**
 * Clase ejecutable para administrar un Curso y sus Alumnos.
 * @authors (Gabriel F. - Lucas E.)
 * @version (13/08/2025)
 */
public class Carrera
{
    public static void main(String args[]){
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del curso: ");
        String nomCarrera = datos.nextLine();
        
        // Se crea la instancia de Curso con el nombre ingresado
        Curso nuevoCurso = new Curso(nomCarrera);
        
        // Se crean los alumnos iniciales según la consigna
        Alumno pedro = new Alumno(32555, "Pedro", "Gomez");
        pedro.setNota1(7.0);
        pedro.setNota2(9.0);
        
        Alumno maria = new Alumno(23564, "Maria", "Vasquez");
        maria.setNota1(5.0);
        maria.setNota2(6.0);
        
        Alumno juan = new Alumno(30123, "Juan", "Perez");
        juan.setNota1(7.0);
        juan.setNota2(9.0);
        
        Alumno marcela = new Alumno(32655, "Marcela", "Martinez");
        marcela.setNota1(4.0);
        marcela.setNota2(8.0);
        
        // Se inscriben los alumnos en el curso
        nuevoCurso.inscribirAlumno(pedro);
        nuevoCurso.inscribirAlumno(maria);
        nuevoCurso.inscribirAlumno(juan);
        nuevoCurso.inscribirAlumno(marcela);
        
        int opcion;
        do{
            System.out.println("\n*** MENU ***");
            System.out.println("1. Inscribir un alumno");
            System.out.println("2. Dar de baja un alumno");
            System.out.println("3. Mostrar inscriptos");
            System.out.println("4. Buscar alumno y mostrar sus datos");
            System.out.println("5. Mostrar promedio de un alumno");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = datos.nextInt();
            datos.nextLine(); // Consumir el salto de línea

            switch(opcion){
                case 1:
                    System.out.println("--- Inscribir alumno ---");
                    System.out.print("Nombre: ");
                    String nomAlumno = datos.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = datos.nextLine();
                    System.out.print("LU: ");
                    int lu = datos.nextInt();
                    datos.nextLine(); 
                    System.out.print("Nota de Primer Parcial: ");
                    double nota1 = datos.nextDouble();
                    datos.nextLine();
                    System.out.print("Nota de Segundo Parcial: ");
                    double nota2 = datos.nextDouble();
                    
                    Alumno nuevoAlumno = new Alumno(lu, nomAlumno, apellido);
                    nuevoAlumno.setNota1(nota1);
                    nuevoAlumno.setNota2(nota2);
                    nuevoCurso.inscribirAlumno(nuevoAlumno);
                    System.out.println("Alumno inscrito correctamente.");
                    break;
                case 2:
                    System.out.println("--- Dar de baja a un alumno ---");
                    System.out.print("Ingrese la LU del alumno a dar de baja: ");
                    int luBaja = datos.nextInt();
                    datos.nextLine();
                    
                    // Verificar si el alumno existe antes de intentar eliminarlo
                    if (nuevoCurso.esAlumno(luBaja)) {
                        nuevoCurso.quitarAlumno(luBaja);
                        System.out.println("El alumno con LU " + luBaja + " ha sido dado de baja.");
                    } else {
                        System.out.println("No se encontró ningún alumno con la LU " + luBaja);
                    }
                    break;
                case 3:
                    System.out.println("****-- Cantidad de inscriptos: " + nuevoCurso.cantidadDeAlumnos());
                    nuevoCurso.mostrarInscriptos();
                    break;
                case 4:
                    System.out.println("--- Buscar alumno por libreta ---");
                    System.out.print("Ingrese la LU del alumno a buscar: ");
                    int luBuscar = datos.nextInt();
                    datos.nextLine();
                    
                    Alumno alumnoEncontrado = nuevoCurso.buscarAlumno(luBuscar);
                    if (alumnoEncontrado != null) {
                        System.out.println("****-- Busca y muestra el alumno con numero de libreta " + luBuscar + " --****");
                        alumnoEncontrado.mostrar();
                    } else {
                        System.out.println("No se encontró ningún alumno con la LU " + luBuscar);
                    }
                    break;
                case 5:
                    System.out.println("--- Mostrar promedio de un alumno ---");
                    System.out.print("Ingrese la LU del alumno para ver su promedio: ");
                    int luPromedio = datos.nextInt();
                    datos.nextLine();
                    
                    nuevoCurso.imprimirPromedioDelAlumno(luPromedio);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número del 0 al 5.");
                    break;
            }
        } while(opcion != 0);
        datos.close();
    }
}