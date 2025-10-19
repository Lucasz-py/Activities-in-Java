import java.util.*;
/**
 * Class Delegacion.
 * Representa un grupo de visitantes, compuesto por varios objetos Individuo.
 * Extiende la clase abstracta Visitante y aplica un descuento a la entrada total del grupo.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Delegacion extends Visitante{
    private ArrayList<Individuo> integrantes; // Lista de los individuos que componen la delegación.
    
    /**
     * Constructor de la clase Delegacion.
     * @param p_nombre Nombre de la delegación (heredado de Visitante).
     * @param p_fecha Fecha de la visita (Calendar, heredado de Visitante).
     * @param p_integrantes Lista inicial de individuos que componen la delegación (ArrayList de Individuo).
     */
    public Delegacion(String p_nombre, Calendar p_fecha, ArrayList<Individuo> p_integrantes){
        super(p_nombre, p_fecha);
        this.setIntegrantes(p_integrantes);
    }
    
    /**
     * Establece la lista de integrantes de la delegación.
     * @param p_integrantes La nueva lista de integrantes (ArrayList de Individuo).
     */
    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    
    /**
     * Devuelve la lista de integrantes de la delegación.
     * @return La lista de integrantes (ArrayList de Individuo).
     */
    public ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
    }
    
    /**
     * Intenta inscribir un nuevo Individuo a la delegación.
     * El individuo solo se agrega si no existe ya un integrante con el mismo DNI.
     * @param p_individuo El individuo a inscribir (Individuo).
     * @return true si el individuo fue agregado, false si ya estaba inscrito.
     */
    public boolean inscribirIndividuo(Individuo p_individuo){
        for(Individuo ind : this.getIntegrantes()){
            // Se asume que el método getDNI() existe en la clase Persona, la cual es parte de Individuo.
            if(ind.getPersona().getDNI() == p_individuo.getPersona().getDNI()){
                return false; // Ya está inscrito (DNI duplicado)
            }
        }
        return this.getIntegrantes().add(p_individuo);
    }
    
    /**
     * Intenta quitar un Individuo de la delegación.
     * @param p_individuo El individuo a quitar (Individuo).
     * @return true si el individuo fue quitado, false en caso contrario.
     */
    public boolean quitarIndividuo(Individuo p_individuo){
        return this.getIntegrantes().remove(p_individuo);
    }
    
    /**
     * Devuelve la cantidad total de integrantes en la delegación.
     * @return El número de integrantes (int).
     */
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    
    /**
     * Implementa el método abstracto de Visitante.
     * Muestra la información de la delegación, incluyendo su nombre y el detalle de cada uno de sus integrantes.
     */
    @Override
    public void mostrar(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Delegación: " + this.getNombre());
        System.out.println("Integrantes:");
        for(Individuo ind : this.getIntegrantes()){
            ind.mostrar();
        }
        System.out.println("Cantidad de Integrantes: " + this.cantidadIntegrantes());
        System.out.println("-------------------------------------------------------------");
    }
    
    /**
     * Implementa el método abstracto de Visitante.
     * Calcula el costo total de la entrada sumando la entrada individual de cada integrante
     * y aplicando un descuento del 10% (multiplicando por 0.9).
     * @return El costo total de la entrada con descuento (double).
     */
    @Override
    public double entrada(){
        double total = 0;
        for(Individuo ind : this.getIntegrantes()){
            total += ind.entrada();
        }
        return total * 0.9;
    }
    
    /**
     * Implementa el método abstracto de Visitante.
     * Recolecta todos los objetos Persona de todos los Individuos de la delegación en un conjunto (HashSet).
     * @return Un conjunto (HashSet) de objetos Persona.
     */
    @Override
    public HashSet<Persona> listarPersonas(){
        HashSet<Persona> personas = new HashSet<Persona>();
        for(Individuo ind : this.getIntegrantes()){
            personas.add(ind.getPersona());
        }
        return personas;
    }
    
    /**
     * Implementa el método abstracto de Visitante.
     * Devuelve el tipo de visitante como "Delegacion".
     * @return El tipo de visitante (String).
     */
    @Override
    public String tipoVisitante(){
        return "Delegacion";
    }

    /**
     * Implementa el método abstracto de Visitante.
     * Muestra la información de la Delegación si coincide con la fecha y el tipo de visitante especificados.
     * @param p_fecha Fecha a comparar (Calendar).
     * @param p_visitante Tipo de visitante a listar (String).
     */
    @Override
    public void listarPorFecha(Calendar p_fecha, String p_visitante){    
        if(this.getFechaVisita().get(Calendar.DAY_OF_YEAR) == p_fecha.get(Calendar.DAY_OF_YEAR) && 
           this.getFechaVisita().get(Calendar.YEAR) == p_fecha.get(Calendar.YEAR) &&
           p_visitante.equals("Delegación")){
            this.mostrar();
        }
    }
}
