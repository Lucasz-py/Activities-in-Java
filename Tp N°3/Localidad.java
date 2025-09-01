
/**
 * Class Localidad.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Localidad{
    private String nombre;
    private String provincia;
    
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvinvia(p_provincia);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProvinvia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getProvincia(){
        return provincia;
    }
    
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "\t" + " Provincia: " + this.getProvincia();
    }
}