import java.util.*;
/**
 * Class Zoologico.
 * Representa la administración de un zoológico, gestionando una colección de Visitantes.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Zoologico{
    private String nombre; // Nombre del zoológico.
    private ArrayList<Visitante> visitantes; // Lista de todos los visitantes registrados.
    
    /**
     * Constructor de la clase Zoologico.
     * @param p_nombre Nombre del zoológico (String).
     * @param p_visitantes Lista inicial de visitantes (ArrayList de Visitante).
     */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    
    /**
     * Establece el nombre del zoológico.
     * @param p_nombre El nombre (String).
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece la lista de visitantes.
     * @param p_visitantes La lista de visitantes (ArrayList de Visitante).
     */
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    
    /**
     * Devuelve el nombre del zoológico.
     * @return El nombre (String).
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Devuelve la lista de visitantes del zoológico.
     * @return La lista de visitantes (ArrayList de Visitante).
     */
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    
    /**
     * Agrega un nuevo visitante a la lista del zoológico.
     * @param p_visitante El visitante a agregar (Visitante).
     * @return true si el visitante fue agregado con éxito.
     */
    public boolean nuevoVisitante(Visitante p_visitante){
        return this.getVisitantes().add(p_visitante);
    }
    
    /**
     * Quita un visitante de la lista del zoológico.
     * @param p_visitante El visitante a quitar (Visitante).
     * @return true si el visitante fue removido con éxito.
     */
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }
    
    /**
     * Lista y muestra la información de los visitantes de un tipo específico que 
     * realizaron la visita en una fecha dada.
     * @param p_fecha Fecha a comparar (Calendar).
     * @param p_visitante Tipo de visitante a listar (String).
     */
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_visitante){
        for(Visitante visitante : this.getVisitantes()){
            // Se asume que el método listarPorFecha filtra por fecha y por tipo de visitante
            visitante.listarPorFecha(p_fecha, p_visitante);
        }
    }
    
    /**
     * Lista y muestra la información de todos los visitantes que realizaron la visita en una fecha dada.
     * @param p_fecha Fecha a comparar (Calendar).
     */
    public void listarVisitantePorFecha(Calendar p_fecha){
        for(Visitante visitante : this.getVisitantes()){
            // Compara solo el día del año y el año.
            if(visitante.getFechaVisita().get(Calendar.DAY_OF_YEAR) == p_fecha.get(Calendar.DAY_OF_YEAR) && 
               visitante.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR)){
                visitante.mostrar();
            }
        }
    }
    
    /**
     * Calcula la recaudación total de entradas entre un rango de fechas (inclusive).
     * @param p_fechaDesde Fecha de inicio del rango (Calendar).
     * @param p_fechaHasta Fecha de fin del rango (Calendar).
     * @return La recaudación total (double).
     */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double total = 0;
        for(Visitante visitante : this.getVisitantes()){
            Calendar fechaVisita = visitante.getFechaVisita();
            // Verifica si la fecha de visita está dentro del rango [p_fechaDesde, p_fechaHasta]
            if((fechaVisita.after(p_fechaDesde) || fechaVisita.equals(p_fechaDesde)) && 
               (fechaVisita.before(p_fechaHasta) || fechaVisita.equals(p_fechaHasta))){
                total += visitante.entrada();
            }
        }
        return total;
    }
    
    /**
     * Devuelve un conjunto (HashSet) con todas las personas que han visitado el zoológico,
     * eliminando duplicados si una persona ha estado en múltiples Delegaciones o como Individuo.
     * @return Un conjunto (HashSet) de objetos Persona.
     */
    public HashSet<Persona> listarPersonasQueVisitaronElZoo(){
        HashSet<Persona> todasLasPersonas = new HashSet<Persona>();
        for(Visitante visitante : this.getVisitantes()){
            // Se asume que el método listarPersonas() devuelve un HashSet<Persona>
            todasLasPersonas.addAll(visitante.listarPersonas());
        }
        return todasLasPersonas;
    }
}
