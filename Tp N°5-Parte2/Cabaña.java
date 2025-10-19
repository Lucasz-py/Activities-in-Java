import java.util.ArrayList;
/**
 * Class Cabaña.
 * Representa un tipo de Alojamiento en formato de cabaña.
 * Hereda de la clase Alojamiento e incluye un costo extra basado en el número de habitaciones.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Cabaña extends Alojamiento{
    private int nroHabitacion; // El número de habitaciones que tiene la cabaña.
    
    /**
     * Constructor de Cabaña.
     * Inicializa un nuevo objeto Cabaña, incluyendo el número de habitaciones.
     * @param p_nombre Nombre del alojamiento.
     * @param p_precioBase Precio base por día del alojamiento.
     * @param p_dias Cantidad de días de alquiler.
     * @param p_servicio Lista de servicios adicionales contratados.
     * @param p_nroH Número de habitaciones de la cabaña.
     */
    public Cabaña(String p_nombre, double p_precioBase, int p_dias, ArrayList<Servicio> p_servicio, int p_nroH){
        super(p_nombre, p_precioBase, p_dias, p_servicio);
        this.setNroHabitacion(p_nroH);
    }
    
    /**
     * Establece el número de habitaciones de la cabaña.
     * @param p_nroH El nuevo número de habitaciones (int).
     */
    private void setNroHabitacion(int p_nroH){
        this.nroHabitacion = p_nroH;
    }
    
    /**
     * Devuelve el número de habitaciones de la cabaña.
     * @return El número de habitaciones (int).
     */
    public int getNroHabitacion(){
        return this.nroHabitacion;
    }
    
    /**
     * Calcula el costo total de la Cabaña.
     * Incluye el costo base, los servicios, y un costo extra de $30 por día por cada habitación.
     * @return El costo total del alojamiento (double).
     */
    public double costo(){
        int costoExtraPorHabitaciones = this.getNroHabitacion() * 30 * super.getDiasAlquiler();
        // El costo base es (precioBase * dias) + costoExtra.
        return super.costo() + costoExtraPorHabitaciones + super.costoServicios();
    }
    
    /**
     * Verifica si este objeto es una "Cabaña".
     * @param p_alojamiento El nombre del tipo de alojamiento a contar (debe ser "Cabaña").
     * @return 1 si el tipo coincide con "Cabaña" (ignorando mayúsculas/minúsculas), 0 en caso contrario.
     */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Cabaña")){
            return 1;
        } else {
            return 0;
        }
    }
    
    /**
     * Imprime en pantalla el detalle de la liquidación de la cabaña,
     * incluyendo el número de habitaciones y el costo final total.
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("\nCabaña con "+this.getNroHabitacion()+" Habitaciones");
        System.out.println("Total: ------> $"+this.costo());
    }
}
