import java.util.ArrayList;
/**
 * Clase abstracta Alojamiento.
 * Representa la base para cualquier tipo de alojamiento (cabañas, hoteles, etc.).
 * Contiene información fundamental como el nombre, el precio base y los días de alquiler,
 * además de una colección de Servicios adicionales.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public abstract class Alojamiento{
    private String nombre;
    private double precioBase;
    private int diasAlquiler; 
    private ArrayList<Servicio> servicio; 

    /**
     * Constructor de la clase Alojamiento.
     * @param p_nombre Nombre del alojamiento (String).
     * @param p_precioBase Precio base diario o por noche del alojamiento (double).
     * @param p_dias Días de alquiler (int).
     * @param p_servicio Lista inicial de servicios adicionales contratados (ArrayList de Servicio).
     */
    public Alojamiento(String p_nombre, double p_precioBase, int p_dias, ArrayList<Servicio> p_servicio){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_dias);
        this.setServicio(p_servicio);
    }

    /**
     * Establece el nombre del alojamiento.
     * @param p_nombre El nombre (String).
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    /**
     * Establece el precio base por día/noche del alojamiento.
     * @param p_precioBase El precio base (double).
     */
    private void setPrecioBase(double p_precioBase){
        this.precioBase = p_precioBase;
    }

    /**
     * Establece la cantidad de días de alquiler.
     * @param p_dias La cantidad de días (int).
     */
    private void setDiasAlquiler(int p_dias){
        this.diasAlquiler = p_dias;
    }

    /**
     * Establece la lista de servicios adicionales.
     * @param p_servicio La lista de servicios (ArrayList de Servicio).
     */
    private void setServicio(ArrayList<Servicio> p_servicio){
        this.servicio = p_servicio;
    }

    /**
     * Devuelve el nombre del alojamiento.
     * @return El nombre (String).
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Devuelve el precio base por día/noche del alojamiento.
     * @return El precio base (double).
     */
    public double getPrecioBase(){
        return this.precioBase;
    }

    /**
     * Devuelve la cantidad de días de alquiler.
     * @return La cantidad de días (int).
     */
    public int getDiasAlquiler(){
        return this.diasAlquiler;
    }

    /**
     * Devuelve la lista de servicios adicionales contratados.
     * @return La lista de servicios (ArrayList de Servicio).
     */
    public ArrayList<Servicio> getServicio(){
        return this.servicio;
    }

    /**
     * Agrega un servicio a la lista de servicios contratados.
     * @param p_servicio El servicio a agregar (Servicio).
     * @return true si el servicio fue agregado con éxito.
     */
    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicio().add(p_servicio);
    }

    /**
     * Quita un servicio de la lista de servicios contratados.
     * @param p_servicio El servicio a quitar (Servicio).
     * @return true si el servicio fue quitado con éxito, false en caso contrario.
     */
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicio().remove(p_servicio);
    }

    /**
     * Método abstracto para contar el número de alojamientos de un tipo específico.
     * Este método debe ser implementado por las subclases (ej. Contar cabañas o Contar hoteles).
     * @param p_alojamiento El tipo de alojamiento a contar (String).
     * @return La cantidad de alojamientos encontrados (int).
     */
    public abstract int contar(String p_alojamiento);

    /**
     * Calcula el costo total solo del alquiler del alojamiento (Precio Base * Días de Alquiler).
     * @return El costo total del alojamiento (double).
     */
    public double costo(){
        return this.getPrecioBase() * this.getDiasAlquiler();
    }

    /**
     * Muestra por consola una lista de los servicios contratados con su respectivo precio.
     */
    public void listarServicios(){
        for(Servicio ser : this.getServicio()){
            System.out.print(ser.getDescripcion()+": $"+ser.getPrecio()+ "\t");
        }
    }

    /**
     * Calcula el costo total acumulado de todos los servicios adicionales contratados.
     * @return El costo total de los servicios (double).
     */
    public double costoServicios(){
        double total = 0;
        for(Servicio ser : this.getServicio()){
            total += ser.getPrecio();
        }
        return total;
    }

    /**
     * Muestra por consola un resumen de la liquidación del alojamiento,
     * incluyendo el costo del alquiler y la lista de servicios.
     */
    public void liquidar(){
        System.out.println("\n★Alojamiento: "+this.getNombre());
        System.out.println("Costo por "+this.getDiasAlquiler()+" dias: $"+(this.getPrecioBase() * this.getDiasAlquiler())+ " alquiler");
        this.listarServicios();
    }
}
