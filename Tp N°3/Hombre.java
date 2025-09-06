
/**
 * Class Hombre.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Hombre{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    /**
     * ★ Constructor de objeto de clase Hombre.
     * @param p_nombre asigna nombre.
     * @param p_apellido asigna apellido.
     * @param p_edad asigna edad.
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
    }
    /**
     * ★ Constructor de objeto de clase Hombre.
     * @param p_nombre asigna nombre.
     * @param p_apellido asigna apellido.
     * @param p_edad asigna edad.
     * @param p_esposa asigna la esposa.
     */
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(p_esposa);
        this.setEstadoCivil("Soltero");
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
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
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
     * Devuelve la esposa.
     * @return esposa.
     */
    public Mujer getEsposa(){
        return this.esposa;
    }
    /**
     * Asigna con el casamiento con una mujer.
     */
    public void casarseCon(Mujer p_mujer){
        if (this.getEsposa() == null && p_mujer.getEsposo() == null){
            this.setEsposa(p_mujer);
            this.setEstadoCivil("Casado");
        } else {
            this.setEstadoCivil("Soltero");
        }
    }
    /**
     * Asigna el divorcio.
     */
    public void divorcio(){
        this.setEsposa(null);
        this.setEstadoCivil("Divorciada");
    }
    /**
     * Muestra en pantalla el nombre, apellido, edad de personas casadas.
     */
    public void casadoCon(){
        System.out.println(this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años esta casado con "+this.getEsposa().getNombre()+" "+this.getEsposa().getApellido()+" de "+this.getEsposa().getEdad()+" años");
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