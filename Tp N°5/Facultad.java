import java.util.ArrayList;
/**
 * Clase Facultad.
 * Representa una unidad académica o facultad, que contiene una lista de objetos de la clase Profesor.
 * Gestiona operaciones relacionadas con la nómina y el personal docente.
 *
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class Facultad{
    private String nombre; // Nombre de la facultad.
    private ArrayList<Profesor> profesores; // Lista de profesores pertenecientes a la facultad.
    
    /**
     * Constructor para la clase Facultad.
     * @param p_nombre Nombre de la facultad (String).
     * @param p_profesor Lista inicial de profesores (ArrayList<Profesor>).
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesor){
        this.setNombre(p_nombre);
        this.setProfesor(p_profesor);
    }
    
    /**
     * Establece el nombre de la facultad.
     * @param p_nombre Nombre de la facultad (String).
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre; 
    }
    
    /**
     * Establece la lista de profesores de la facultad.
     * @param p_profesor Lista de profesores (ArrayList<Profesor>).
     */
    private void setProfesor(ArrayList<Profesor> p_profesor){
        this.profesores = p_profesor;
    }
    
    /**
     * Obtiene el nombre de la facultad.
     * @return El nombre de la facultad (String).
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene la lista de profesores de la facultad.
     * @return La lista de profesores (ArrayList<Profesor>).
     */
    public ArrayList<Profesor> getProfesor(){
        return this.profesores;
    }
    
    /**
     * Agrega un profesor a la lista de profesores de la facultad.
     * @param p_profesor El objeto Profesor a agregar.
     * @return true si se agregó con éxito.
     */
    public boolean agregarProfesor(Profesor p_profesor) {
        return this.profesores.add(p_profesor);
    }
    
    /**
     * Quita un profesor de la lista de profesores.
     * Solo permite la remoción si hay más de un profesor en la lista.
     * @param p_profesor El objeto Profesor a quitar.
     * @return true si se quitó con éxito, false si solo hay un profesor o no se encontró el profesor.
     */
    public boolean quitarEmpleado(Profesor p_profesor) {
        if(this.getProfesor().size() > 1){
            return this.getProfesor().remove(p_profesor); 
        } else { 
            return false;
        }
    }
    
    /**
     * Imprime en consola la nómina de profesores de la facultad, mostrando
     * DNI, Nombre y el sueldo total (suma de sueldos básicos de todos los cargos) de cada uno. 
     * También muestra el total a pagar.
     */
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: "+ this.getNombre());
        System.out.println("------------------------------------------------------------------");
        for(Profesor prof : this.getProfesor()){
            System.out.println("DNI: "+prof.getDNI()+ " Nombre: "+prof.getNombre()+ " - Sueldo Total: "+prof.sueldoTotal());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Total a Pagar: $"+this.totalAPagar());
    }
    
    /**
     * Calcula la suma total de los sueldos básicos de todos los profesores de la facultad
     * llamando al método sueldoTotal() de cada profesor.
     * @return El monto total a pagar en concepto de sueldos básicos (double).
     */
    public double totalAPagar(){
        double total = 0.0;
        for(Profesor prof : this.getProfesor()){
            total += prof.sueldoTotal();
        }
        return total;
    }
    
    /**
     * Imprime un detalle completo de todos los profesores y los cargos que poseen 
     * utilizando el método mostrar() de la clase Profesor.
     */
    public void listarProfesorCargos(){
        System.out.println("***** Detalle de Profesores y cargos de Facultad: "+this.getNombre()+" *****");
        for(Profesor prof : this.getProfesor()){
            prof.mostrar();
        }
        System.out.println("Hay "+ this.getProfesor().size()+" Profesores");
    }
}
