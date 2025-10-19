import java.util.*;
/**
 * Class Individuo.
 * Representa un tipo específico de Visitante, asociado a una única Persona.
 * Extiende la clase abstracta Visitante e implementa todos sus métodos abstractos.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Individuo extends Visitante{
    private Persona persona; 
    
    /**
     * Constructor de la clase Individuo.
     * @param p_nombre Nombre del visitante (heredado de Visitante).
     * @param p_fecha Fecha de la visita (Calendar, heredado de Visitante).
     * @param p_persona El objeto Persona asociado a este visitante.
     */
    public Individuo(String p_nombre, Calendar p_fecha, Persona p_persona){
        super(p_nombre, p_fecha);
        this.setPersona(p_persona);
    }
    
    /**
     * Establece el objeto Persona asociado.
     * @param p_persona El objeto Persona (Persona).
     */
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    
    /**
     * Devuelve el objeto Persona asociado a este visitante individual.
     * @return El objeto Persona (Persona).
     */
    public Persona getPersona(){
        return this.persona;
    }
    
    /**
     * Devuelve el tipo de visitante como "Individuo".
     * Implementa el método abstracto de Visitante.
     * @return El tipo de visitante (String).
     */
    @Override
    public String tipoVisitante(){
        return "Individuo";
    }
    
    /**
     * Implementa el método abstracto de Visitante.
     * Muestra la información del Individuo si coincide con la fecha y el tipo de visitante especificados.
     * @param p_fecha Fecha a comparar (Calendar).
     * @param p_visitante Tipo de visitante a listar (String).
     */
    @Override
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.getFechaVisita().get(Calendar.DAY_OF_YEAR) == p_fecha.get(Calendar.DAY_OF_YEAR) && 
           this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
           p_visitante.equals("Individuo")){
            this.mostrar();
        }
    }
    
    /**
     * Implementa el método abstracto de Visitante.
     * Muestra la información de la Persona asociada.
     */
    @Override
    public void mostrar(){
        this.getPersona().mostrar();
    }
    
    /**
     * Implementa el método abstracto de Visitante.
     * Devuelve el costo de la entrada para un visitante Individual (tarifa fija de 10.0).
     * @return El costo de la entrada (double).
     */
    @Override
    public double entrada(){
        return 10.0;
    }
    
    /**
     * Implementa el método abstracto de Visitante.
     * Devuelve un conjunto (HashSet) que contiene únicamente la Persona asociada a este visitante.
     * @return Un conjunto (HashSet) de objetos Persona.
     */
    @Override
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet<Persona>();
        personas.add(this.getPersona());
        return personas;
    }
}
