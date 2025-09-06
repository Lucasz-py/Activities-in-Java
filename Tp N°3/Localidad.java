
/**
 * Class Localidad.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Localidad{
    private String nombre;
    private String provincia;
    /**
     * Constructor de objeto de clase Localidad
     * @param p_nombre asigna nombre.
     * @param p_provincia asigna provincia.
     */
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvinvia(p_provincia);
    }
    /**
     * Actualiza el nombre.
     * @param p_nombre asigna nombre.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Actualiza la provincia.
     * @param p_provincia asigna provincia.
     */
    private void setProvinvia(String p_provincia){
        this.provincia = p_provincia;
    }
    /**
     * Devuelve atributo nombre.
     * @return nombre.
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve atributo nombre.
     * @return provincia.
     */
    public String getProvincia(){
        return provincia;
    }
    /**
     * devuelve una cadena con el nombre y la provincia.
     * @return el nombre y la provincia.
     */
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "\t" + " Provincia: " + this.getProvincia();
    }
}