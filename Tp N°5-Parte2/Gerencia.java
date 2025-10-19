import java.util.ArrayList;
/**
 * Class Gerencia.
 * Representa la administración de los alojamientos alquilados, permitiendo
 * la gestión, conteo y liquidación de los mismos.
 * * @author (Escobar Luacas & Fernandez Gabriel) 
 * @version (19/10/2025)
 */
public class Gerencia{
    private String nombre; // Nombre de la gerencia o administración.
    private ArrayList<Alojamiento> alojamientosAlquilados; // Lista de alojamientos actualmente alquilados.
    
    /**
     * Constructor de la clase Gerencia.
     * @param p_nombre Nombre de la gerencia.
     * @param p_alquilados Lista inicial de alojamientos alquilados.
     */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alquilados){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alquilados);
    }
    
    /**
     * Establece el nombre de la gerencia.
     * @param p_nombre El nombre de la gerencia.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Establece la lista de alojamientos alquilados.
     * @param p_alquilados La nueva lista de alojamientos alquilados.
     */
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alquilados){
        this.alojamientosAlquilados = p_alquilados;
    }
    
    /**
     * Devuelve la lista de alojamientos alquilados.
     * @return La lista de objetos Alojamiento (ArrayList).
     */
    public ArrayList<Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }
    
    /**
     * Devuelve el nombre de la gerencia.
     * @return El nombre de la gerencia (String).
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Agrega un alojamiento a la lista de alojamientos alquilados.
     * @param p_alojamiento El alojamiento a agregar.
     * @return true si el alojamiento fue agregado con éxito, false en caso contrario.
     */
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    
    /**
     * Quita un alojamiento de la lista de alojamientos alquilados.
     * @param p_alogamiento El alojamiento a quitar.
     * @return true si el alojamiento fue removido con éxito, false en caso contrario.
     */
    public boolean quitarAlojamiento(Alojamiento p_alogamiento){
        return this.getAlojamientosAlquilados().remove(p_alogamiento);
    }
    
    /**
     * Cuenta la cantidad de alojamientos de un tipo específico en la lista.
     * Utiliza el método {@code contar(String)} de cada objeto Alojamiento.
     * @param tipoAlojamiento El tipo de alojamiento a contar (e.g., "Cabaña", "Hotel").
     * @return La cantidad total de alojamientos del tipo especificado (int).
     */
    public int contarAlojamiento(String tipoAlojamiento){
        int contador = 0;
        for(Alojamiento alojamiento : this.getAlojamientosAlquilados()){
            contador += alojamiento.contar(tipoAlojamiento);
        }
        return contador;
    }
    
    /**
     * Llama al método {@code liquidar()} en cada alojamiento alquilado
     * para imprimir el detalle individual de cada uno.
     */
    public void liquidar(){
        for(Alojamiento alojamiento : this.getAlojamientosAlquilados()){
            alojamiento.liquidar();
        }
    }
    
    /**
     * Imprime en pantalla la liquidación completa de la gerencia,
     * incluyendo el detalle de cada alojamiento y un resumen por tipo (Cabaña y Hotel).
     */
    public void mostrarLiquidacion(){
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidación-------------------");
        this.liquidar();
        System.out.println("\n-----------------------------------");
        System.out.println("Alojamiento tipo Cabaña ---->" + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ------->" + this.contarAlojamiento("Hotel"));
    }
}
