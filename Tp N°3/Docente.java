
/**
 * Class Docente.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Docente{
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    /**
     * ★ Constructor de clase de objeto Docente.
     * @param p_nombre asigna nombre.
     * @param p_grado  asigna el grado.
     * @param p_sueldoBasico asigna el sueldo básico.
     * @param p_asig asigna la asignación familiar.
     */
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asig){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacion(p_asig);
    }
    /**
     * Actualiza el nombre.
     * @param p_nombre asigna nombre.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Actualiza el grado.
     * @param p_grado asigna grado.
     */
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    /**
     * Actualiza el sueldo básico.
     * @param p_sueldoBasico asigna el sueldo básico.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    /**
     * Actualiza la asignación familiar.
     * @param p_asig asigna asignación.
     */
     private void setAsignacion(double p_asig){
         this.asignacionFamiliar = p_asig;
    }
    /**
     * Devuelve el atributo nombre.
     * @return nombre
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve el atributo nombre.
     * @return nombre
     */
    public String getGrado(){
        return grado;
    }
    /**
     * Devuelve el sueldo básico.
     * @return sueldoBasico.
     */
    public double getSueldoBasico(){
        return sueldoBasico;
    }
    /**
     * Devuelve el atributo nombre.
     * @return asignacionFamiliar.
     */
    public double getAsignacion(){
        return asignacionFamiliar;
    }
    /**
     * Retorna el cálculo del sueldo.
     * @return sueldo.
     */
    public double calcularSueldo(){
        double sueldo = this.getSueldoBasico() + this.getAsignacion();
        return sueldo;
    }
    
}