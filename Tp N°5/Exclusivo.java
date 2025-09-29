
/**
 * Write a description of class Exclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exclusivo extends Cargo{
    private int horasDeInvestigacion;
    private int horasDeExtencion;
    
    public Exclusivo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horas, int p_horasInv, int p_horasExten){
        super(p_nombreCargo, p_sueldo, p_anio, p_horas);
        this.setHorasInvestigacion(p_horasInv);
        this.setHorasExtencion(p_horasExten);
    }
    
    private void setHorasInvestigacion(int p_horasEx){
        this.horasDeInvestigacion = p_horasEx;
    }
    private void setHorasExtencion(int p_horasExten){
        this.horasDeExtencion = p_horasExten;
    }
    public void mostrarCargo(){
        
    }
}