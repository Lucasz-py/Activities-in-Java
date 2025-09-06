
/**
 * Class Mujer.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Mujer{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
     * Constructor de objeto de clase Hombre.
     * @param p_nombre asigna nombre.
     * @param p_apellido asigna apellido.
     * @param p_edad asigna edad.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
    }
    
    /**
     * Constructor de objeto de clase Hombre.
     * @param p_nombre asigna nombre.
     * @param p_apellido asigna apellido.
     * @param p_edad asigna edad.
     * @param p_esposo asigna esposo.
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposo(p_esposo);
        this.setEstadoCivil("Soltera");
    }
    /**
     * Actualiza el nombre.
     * @param p_nombre asigna nombre.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Actualiza el apellido.
     * @param p_apellido asigna apellido.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
     * Actualiza la edad.
     * @param p_edad asigna la edad.
     */
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    /**
     * Actualiza el estado civil.
     * @param p_estadoCivil asigna el estado civil.
     */
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    /**
     * Actualiza la esposa.
     * @param p_esposa asigna la esposa.
     */
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    /**
     * Devuelve el nombre.
     * @return nombre.
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Devuelve el apellido.
     * @return apellido.
     */
    public String getApellido(){
        return this.apellido;
    }
    /**
     * Devuelve la edad.
     * @return edad.
     */
    public int getEdad(){
        return this.edad;
    }
    /**
     * Devuelve el estado civil.
     * @return estadoCivil.
     */
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    /**
     * Devuelve el esposo.
     * @return esposo.
     */
    public Hombre getEsposo(){
        return this.esposo;
    }
    /**
     * Asigna con el casamiento con un hombre.
     */
    public void casarseCon(Hombre p_hombre){
        if (this.getEsposo() == null && p_hombre.getEsposa() == null){
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada");
        } else {
            this.setEstadoCivil("Soltera");
        }
    }
    /**
     * Asigna el divorcio.
     */
    public void divorcio(){
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
    }
    /**
     * Muestra en pantalla el nombre, apellido, edad de personas casadas.
     */
    public void casadaCon(){
        System.out.println(this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años esta casada con "+this.getEsposo().getNombre()+" "+this.getEsposo().getApellido()+" de "+this.getEsposo().getEdad()+" años");
    }
    /**
     * Muestra en pantalla el estado civil de la persona.
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años - "+this.getEstadoCivil());
    }
    /**
     * Muestra en pantalla el nombre, apellido, edad de la persona.
     * @return una cadena con el nombre, apellido y edad de la persona.
     */
    public String datos(){
        return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años";
    }
}