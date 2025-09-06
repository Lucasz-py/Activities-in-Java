
/**
 * Class Escuela.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Escuela{
    private String nombre;
    private String domicilio;
    private String director;
    
    /**
     * ★ Constructor de objeto de clase Escuela.
     * @param p_nombre asigna el nombre.
     * @param p_domicilio asigna el domicilio.
     * @param p_director asigna el nombre del director.
     */
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    /**
     * Actualiza el nombre.
     * @param p_nombre asigna nombre de la escuela.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * @param p_nombre asigna el domicilio de la escuela.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    /**
     * Actualiza el director.
     * @param p_director asigna el nombre del director.
     */
    private void setDirector(String p_director){
        this.director = p_director;
    }
    /**
     * Devuelve el atributo nombre.
     * @return nombre.
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve el atributo domicilio.
     * @return dimicilio.
     */
    public String getDomicilio(){
        return domicilio;
    }
    /**
     * Devuelve el atributo director.
     * @return director.
     */
    public String getDirector(){
        return director;
    }
    /**
     * Muestra en pantalla el nombre, el domicilio de la escuela y el nombre del director, nombre del docente, sueldo del docente, sueldo básico y asignación familiar.
     */
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: "+this.getNombre()+"\t"+"Domicilio: "+this.getDomicilio()+"\t"+"Director: "+this.getDirector());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Docente:    "+p_docente.getNombre());
        System.out.println("Sueldo .............................     $"+p_docente.calcularSueldo());
        System.out.println("Sueldo Basico: .....................     $"+p_docente.getSueldoBasico());
        System.out.println("Asignacion familiar ................     $"+p_docente.getAsignacion());
    }
}