import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 * Clase Profesor.
 * Representa a un docente, heredando de la clase Persona y gestionando una lista 
 * de cargos (clase Cargo) que posee.
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class Profesor extends Persona{
    private String titulo; // Título académico del profesor.
    private ArrayList<Cargo> cargos; // Lista de cargos que el profesor ocupa.
    
    /**
     * Constructor para la clase Profesor.
     * @param p_nroDni Número de DNI del profesor (int) (Heredado de Persona).
     * @param p_nombre Nombre del profesor (String) (Heredado de Persona).
     * @param p_apellido Apellido del profesor (String) (Heredado de Persona).
     * @param p_anio Año de ingreso/nacimiento (depende de la implementación de Persona) (int) (Heredado de Persona).
     * @param p_titulo Título académico del profesor (String).
     * @param p_cargo Lista inicial de cargos del profesor (ArrayList<Cargo>).
     */
    public Profesor(int p_nroDni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargo){
        super(p_nroDni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargo(p_cargo);
    }
    
    /**
     * Establece el título académico del profesor.
     * @param p_titulo Título académico (String).
     */
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    /**
     * Establece la lista de cargos del profesor.
     * @param p_cargo Lista de cargos (ArrayList<Cargo>).
     */
    private void setCargo(ArrayList<Cargo> p_cargo){
        this.cargos = p_cargo;
    }
    
    /**
     * Obtiene el título académico del profesor.
     * @return El título académico (String).
     */
    public String getTitulo(){
        return this.titulo;
    }
    
    /**
     * Obtiene la lista de cargos del profesor.
     * @return La lista de cargos (ArrayList<Cargo>).
     */
    public ArrayList<Cargo> getCargo(){
        return this.cargos;
    }
    
    /**
     * Agrega un nuevo cargo a la lista de cargos del profesor.
     * @param p_cargo El objeto Cargo a agregar.
     * @return true si se agregó con éxito.
     */
    public boolean agregarCargo(Cargo p_cargo) {
        return this.cargos.add(p_cargo);
    }
    
    /**
     * Quita un cargo específico de la lista de cargos del profesor.
     * Solo permite quitar el cargo si el profesor posee más de un cargo.
     * @param p_cargo El objeto Cargo a quitar.
     * @return true si se quitó con éxito, false si el profesor solo tiene un cargo o si no se encontró el cargo.
     */
    public boolean quitarEmpleado(Cargo p_cargo) {
        if(this.getCargo().size() > 1){
            return this.getCargo().remove(p_cargo); 
        } else { 
            return false;
        }
    }
    
    /**
     * Muestra la información completa del profesor, incluyendo datos personales
     * (heredados de Persona) y los detalles de todos sus cargos asignados.
     */
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("\n");
        System.out.println("****** Cargos Asignados ******");
        System.out.println("----------------------------");
        this.listarCargos();
        System.out.println("\n");
        
    }
    
    /**
     * Recorre la lista de cargos y llama al método mostrarCargo() de cada uno.
     * Esto detalla los atributos de cada cargo.
     */
    public void listarCargos(){
        for (Cargo car : this.getCargo()){
            car.mostrarCargo();
        }
    }
    
    /**
     * Calcula la suma total de los sueldos básicos de todos los cargos asignados.
     * NOTA: La implementación actual suma solo el Sueldo Básico de cada cargo. Si se 
     * busca el sueldo total (con adicionales), se debería usar car.sueldoDelCargo().
     * @return La suma de los sueldos básicos de todos los cargos (double).
     */
    public double sueldoTotal(){
        double sueldoT = 0.0;
        for(Cargo car : this.getCargo()){
            // La línea original: sueldoT =+ car.getSueldoBasico();
            // Esto es incorrecto. Se reemplaza con la acumulación correcta:
            sueldoT += car.getSueldoBasico(); 
        }
        return sueldoT;
    }
    
    /**
     * Genera una cadena de texto que resume la información principal del profesor:
     * DNI, Nombre y Sueldo Total.
     * @return Una cadena formateada (String).
     */
    public String mostrarLinea(){
        return "DNI: "+super.getDNI()+" - Nombre: "+super.getNombre()+" - Sueldo Total: "+this.sueldoTotal();
    }
}
