import java.util.ArrayList;
/**
 * Class Hotel.
 * Representa un tipo de Alojamiento Hotelero.
 * Hereda de la clase Alojamiento e incluye la lógica de costo extra por tipo de habitación.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Hotel extends Alojamiento{
    private String tipoHabitacion;
    /**
     * Constructor de Hotel.
     * Inicializa un nuevo objeto Hotel, incluyendo el tipo de habitación.
     * @param p_nombre Nombre del alojamiento.
     * @param p_precioBase Precio base por día del alojamiento.
     * @param p_dias Cantidad de días de alquiler.
     * @param p_servicio Lista de servicios adicionales contratados.
     * @param p_tipoH Tipo de habitación (e.g., "Single", "Doble").
     */
    public Hotel(String p_nombre, double p_precioBase, int p_dias, ArrayList<Servicio> p_servicio, String p_tipoH){
        super(p_nombre, p_precioBase, p_dias, p_servicio);
        this.setTipoHabitacion(p_tipoH);
    }
    
    /**
     * Establece el tipo de habitación.
     * @param p_tipoH El nuevo tipo de habitación (String).
     */
    private void setTipoHabitacion(String p_tipoH){
        this.tipoHabitacion = p_tipoH;
    }
    
    /**
     * Devuelve el tipo de habitación.
     * @return El tipo de habitación (String).
     */
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }
    
    /**
     * Verifica si este objeto es un "Hotel".
     * @param p_alojamiento El nombre del tipo de alojamiento a contar (debe ser "Hotel").
     * @return 1 si el tipo coincide con "Hotel" (ignorando mayúsculas/minúsculas), 0 en caso contrario.
     */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Hotel")){
            return 1;
        } else {
            return 0;
        }
    }
    
    /**
     * Calcula el costo total del Hotel, incluyendo el costo base, los servicios,
     * y un costo extra basado en el tipo de habitación (Single: $20/día, Doble: $30/día).
     * @return El costo total del alojamiento (double).
     */
    public double costo(){
        double costoBase = super.costo();
        double costoServicios = super.costoServicios();
        double costoExtraHabitacion = 0;
        
        if(this.getTipoHabitacion().equals("Single")){
            costoExtraHabitacion = super.getDiasAlquiler() * 20;
        } else if (this.getTipoHabitacion().equals("Doble")){
            costoExtraHabitacion = super.getDiasAlquiler() * 30;
        } else {
            System.out.println("Tipo de Habitacion Incorrecta");
        }
        
        return costoBase + costoExtraHabitacion + costoServicios;
    }
    
    /**
     * Imprime en pantalla el detalle de la liquidación del alojamiento,
     * incluyendo el tipo de habitación y el costo final total.
     */
    public void liquidar(){
        super.liquidar();
        System.out.println("Habitacion: "+this.getTipoHabitacion());
        System.out.println("Total: ------> $"+this.costo());
    }
}
