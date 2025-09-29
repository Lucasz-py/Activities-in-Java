
/**
 * Write a description of class Cargo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cargo{
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    
    public Cargo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horasDocencia){
        this.setNombre(p_nombreCargo);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anio);
        this.setHorasDocencia(p_horasDocencia);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setSueldoBasico(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    private void setHorasDocencia(int p_horasDocencia){
        this.horasDeDocencia = p_horasDocencia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int gerAnioIngreso(){
        return this.anioIngreso;
    }
    
    public int getHorasDocencia(){
        return this.horasDeDocencia;
    }
    public int antiguedad(){
        return 8;
    }
    
    private double adicionalXAntiguiedad(){
        return 8;
    }
    
    public double sueldoDelCargo(){
        return 9;
    }
    
    public void mostrarCargo(){
        
    }
}