import java.util.*;
/**
 * Clase curso
 * @authors (Gabriel F. - Lucas E.)
 * @version (20/09/2025)
 */

public class Curso
{
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;
    
    /**
     * Constructor para objetos de clase Curso.
     * @param p_nombre asigna nombre al curso.
     */
    public Curso(String p_nombre)
    {   
        this.setNombre(p_nombre);
        this.alumnos = new HashMap<Integer, Alumno>();
    }
    
    /**
     * Constructor para objetos de clase Curso.
     * @param p_nombre asigna nombre al curso.
     * @param p_alumnos asigna colecciones de tipo HashMap.
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos)
    {
        this.setNombre(p_nombre);
        this.alumnos = p_alumnos;
    }   
    
    /**
     * Actualiza el nombre del curso.
     * @param p_nombre asigna nombre al curso.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Devuelve nombre del curso.
     * @return this.nombre.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Retorna la colección de alumnos del curso.
     */
    private HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    
    /**
     * Inscribe al alumno a la colección del curso.
     * @param  p_alumno asigna alumno.
     */
    public void inscribirAlumno(Alumno p_alumno)
    {
        this.alumnos.put(p_alumno.getLU(), p_alumno);
    }
    
    /**
     * Quita un alumno de la colección del curso.
     * @param  p_alumno el alumno que está en la clase Alumno. 
     */
    public void quitarAlumno(Alumno p_alumno)
    {
        this.alumnos.remove(p_alumno.getLU());
    }
    
    /**
     * Quita alumno a un alumno de la colección por medio de su LU.
     * @param  p_LU busca la LU del alumno.
     * @return  LU del alumno 
     */
    public Alumno quitarAlumno(int p_LU)
    {
        return this.alumnos.remove(p_LU);
    }
    
    /**
     * Busca al alumno en la colección y devuelve KEY de LU pasado por parámetro.
     * @param   p_LU busca LU del alumno.
     * @return  KEY de LU del alumno. 
     */
    public Alumno buscarAlumno(int p_LU)
    {
        return this.alumnos.get(p_LU);
    }
    
    /**
    * Verifica si un alumno sigue en la cursada.
    * @param  p_LU busca LU del alumno.
    * @return  false si no encuentra al alumno, si encuentra al alumno por medio del LU devuelve true.
    */
    public boolean esAlumno(int p_LU)
    {
        return this.alumnos.containsKey(p_LU);
    }
    
    /**
    * Verifica si un alumno sigue en la cursada.
    * @param  p_LU busca LU del alumno.
    * @return  false si no encuentra al alumno por medio de su objeto y true si ocurre lo contrario.
    */
    public boolean esAlumno(Alumno p_alumno)
    {
        return this.alumnos.containsValue(p_alumno);
    }
    
    /**
    * Muestra en pantalla el promedio del Alumno.
    * @param  p_LU encuentra número de libreta universitaria.
    */
    public void imprimirPromedioDelAlumno(int p_LU)
    {
        Alumno alumnoEncontrado = this.buscarAlumno(p_LU);
        if(alumnoEncontrado != null){
            double promedio = alumnoEncontrado.promedio();
            System.out.println("El promedio del alumno " + alumnoEncontrado.nomYApe() + " es: " + promedio);
        } else {
            System.out.println("No se encontró ningún alumno con la LU " + p_LU);
        }
    }
    
    /**
    * Cuenta la cantidad de alumnos que hay en la colección devuelve el número exacto de alumnos.
    * @return la cantidad de alumnos.
    */
    public int cantidadDeAlumnos(){
        return this.alumnos.size();
    }
    
    /**
     * Muestra en pantalla los alumnos inscriptos al curso.
     */
    public void mostrarInscriptos(){
        System.out.println("--- Alumnos Inscriptos en " + this.getNombre() + " ---");
        for (Alumno alumno : this.alumnos.values()) {
            System.out.println(alumno.getLU() + " " + alumno.nomYApe());
            System.out.println("----------------------------");
        }
    }
}