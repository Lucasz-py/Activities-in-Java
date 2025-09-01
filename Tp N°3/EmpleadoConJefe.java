
/**
 * Class EmpleadoConJefe.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
import java.util.*;

public class EmpleadoConJefe{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private int anioIngreso;
    private EmpleadoConJefe jefe;
    
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }
    
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }
    
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
    }
    
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    private void setFechaIngreso(Calendar p_fechaIngreso){
        this.fechaIngreso = p_fechaIngreso;
    }
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
    
    public long getCuil(){
        return this.cuil;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int mesHoy = fechaHoy.get(Calendar.MONTH);
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_MONTH);
        
        int anioIngreso = this.getFechaIngreso().get(Calendar.YEAR);
        int mesIngreso = this.getFechaIngreso().get(Calendar.MONTH);
        int diaIngreso = this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
        
        int antiguedad = anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
        
        if (mesHoy < mesIngreso || (mesHoy == mesIngreso && diaHoy < diaIngreso)) {
            antiguedad--;
        }
        
        return antiguedad;
    }
    
    private double descuento(){
        return (this.sueldoBasico * 0.02) + 1500;
    }
    
    private double adicional(){
        if(antiguedad() >= 0 && antiguedad() < 2){
            return sueldoBasico * 0.02;
        } if(antiguedad() >= 2 && (antiguedad() < 10)){
            return sueldoBasico * 0.04;
        } else {
            return sueldoBasico * 0.06;
        }
    }
    
     public double sueldoNeto(){
        return sueldoBasico - descuento() + adicional(); 
    }
    
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    public String mostrarLinea(){
        return this.getCuil() + "\t" + this.getApellido() + "," + this.getNombre() + "\t" + "..............." + "$ " + this.sueldoNeto();
    }
    
    public void mostrarPantalla(){
        System.out.println("Nombre y Apellido: "+this.nomYApe());
        System.out.println("CUIL: "+this.getCuil());
        System.out.println("Sueldo Neto: " + "$" + sueldoNeto());
        if(this.getJefe() == null){
            System.out.println("Responde a GERENTE GENERAL");
        } else {
            System.out.println("Responde a: "+this.getJefe().nomYApe());
        }
    }
}