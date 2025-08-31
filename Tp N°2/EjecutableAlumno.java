
/**
 * Ejecutable Alumno.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (13/08/2025)
 */
public class EjecutableAlumno
{
    public static void main(String []args){
        //caso de prueba 1: Juan Perez
        int lu = Integer.parseInt(args[0]);
        String nombre   = args[1];
        String apellido = args[2];
        Double nota1 = Double.parseDouble(args[3]);
        Double nota2 = Double.parseDouble(args[4]);
        Alumno alumno1 = new Alumno(lu, nombre, apellido);
        alumno1.setNota1(nota1);
        alumno1.setNota2(nota2);
        alumno1.mostrar();
        
        
        /*Caso de prueba 2: María Gomez
        int lu = Integer.parseInt(args[0]);
        String nombre   = args[1];
        String apellido = args[2];
        Double nota1 = Double.parseDouble(args[3]);
        Double nota2 = Double.parseDouble(args[4]);
        Alumno alumno2 = new Alumno(2051, "María","Gomez");
        
        alumno2.setNota1(nota1);
        alumno2.setNota2(nota2);
        alumno2.mostrar();
        */
    }
}