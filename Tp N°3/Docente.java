
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
    
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asig){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacion(p_asig);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
     private void setAsignacion(double p_asig){
         this.asignacionFamiliar = p_asig;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getGrado(){
        return grado;
    }
    public double getSueldoBasico(){
        return sueldoBasico;
    }
    public double getAsignacion(){
        return asignacionFamiliar;
    }

    public double calcularSueldo(){
        double sueldo = this.getSueldoBasico() + this.getAsignacion();
        return sueldo;
    }
    
}