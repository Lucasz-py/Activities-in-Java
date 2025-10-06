import java.time.Year;
/**
 * Write a description of class Cargo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cargo{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    
    public Cargo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horasDocencia){
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anio);
        this.setHorasDocencia(p_horasDocencia);
    }
    
    private void setNombreCargo(String p_nombre){
        this.nombreCargo = p_nombre;
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
    
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    public int getHorasDocencia(){
        return this.horasDeDocencia;
    }
    
    public int antiguedad(){
        int anioActual = Year.now().getValue();
        return anioActual - this.getAnioIngreso();
    }
    
    private double adicionalXAntiguedad(){
        double adicional = this.antiguedad() * 0.01;;
        return adicional;
    }
    
    public double sueldoDelCargo(){ 
        double sueldoC = (this.adicionalXAntiguedad() * this.getSueldoBasico()) + this.getSueldoBasico();
        return sueldoC;
    }
    
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo()+ " - Sueldo Basico: $"+this.getSueldoBasico()+" - Sueldo Cargo: $"+
        this.sueldoDelCargo()+" - Antiguedad: "+this.antiguedad()+ " - Horas Docencia: "+ this.getHorasDocencia());
    }
}