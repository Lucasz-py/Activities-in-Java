
/**
 * Write a description of class Servicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Servicio {
    private String descripcion;
    private double precio;
    /**
     * Constructor de Servicio.
     * Por defecto, un servicio se inicializa como NO activo.
     */
    public Servicio(String p_descripcion, double p_precio){
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }
    
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
   
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
}