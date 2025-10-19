/**
 * Class Servicio.
 * Representa un servicio ofrecido, definido por su descripción y un precio asociado.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Servicio {
    private String descripcion; // Descripción textual del servicio.
    private double precio; // Precio del servicio.
    
    /**
     * Constructor de Servicio.
     * Inicializa un nuevo objeto Servicio con una descripción y un precio dados.
     * @param p_descripcion La descripción del servicio (String).
     * @param p_precio El precio del servicio (double).
     */
    public Servicio(String p_descripcion, double p_precio){
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }
    
    /**
     * Establece la descripción del servicio.
     * @param p_desc La nueva descripción del servicio.
     */
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    
    /**
     * Establece el precio del servicio.
     * @param p_precio El nuevo precio del servicio.
     */
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    
    /**
     * Devuelve la descripción del servicio.
     * @return La descripción del servicio (String).
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
     * Devuelve el precio del servicio.
     * @return El precio del servicio (double).
     */
    public double getPrecio(){
        return this.precio;
    }
}
