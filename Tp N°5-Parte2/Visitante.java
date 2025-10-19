import java.util.*;
/**
 * Class Visitante.
 * Representa un visitante abstracto de un lugar o evento.
 * Contiene información básica como el nombre y la fecha de la visita.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public abstract class Visitante{
    private String nombre; // Nombre del visitante.
    private Calendar fechaVisita; // Fecha en que se realizó la visita.
    
    /**
     * Constructor de la clase Visitante.
     * @param p_nombre Nombre del visitante (String).
     * @param p_fecha Fecha de la visita (Calendar).
     */
    public Visitante(String p_nombre, Calendar p_fecha){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fecha);
    }
    
    /**
     * Establece el nombre del visitante.
     * @param p_nombre El nombre del visitante (String).
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece la fecha de la visita.
     * @param p_fecha La fecha de la visita (Calendar).
     */
    private void setFechaVisita(Calendar p_fecha){
        this.fechaVisita = p_fecha;
    }
    
    /**
     * Devuelve el nombre del visitante.
     * @return El nombre del visitante (String).
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Devuelve la fecha de la visita.
     * @return La fecha de la visita (Calendar).
     */
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }
    
    /**
     * Método abstracto para mostrar la información específica del visitante.
     */
    public abstract void mostrar();
    
    /**
     * Método abstracto para calcular el costo de la entrada o tarifa aplicable al visitante.
     * @return El costo de la entrada (double).
     */
    public abstract double entrada();
    
    /**
     * Método abstracto para listar los visitantes de un tipo específico para una fecha determinada.
     * @param p_fecha Fecha a comparar.
     * @param p_visitante Tipo de visitante a listar (String).
     */
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    
    /**
     * Método abstracto para obtener el tipo de visitante (ej: "Estudiante", "Adulto").
     * @return El tipo de visitante (String).
     */
    public abstract String tipoVisitante();
    
    /**
     * Método abstracto para listar personas relacionadas con la visita (se asume que existe la clase Persona).
     * @return Un conjunto (HashSet) de objetos Persona.
     */
    public abstract HashSet<Persona> listarPersonas();
}
