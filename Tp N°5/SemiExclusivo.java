
/**
 * Write a description of class SemiExclusivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SemiExclusivo extends Cargo{
    private int horasDeInvestigacion;
    
    public SemiExclusivo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horas, int p_horasInv){
        super(p_nombreCargo, p_sueldo, p_anio, p_horas);
        this.setHorasInvestigacion(p_horasInv);
    }
    
    private void setHorasInvestigacion(int p_horasEx){
        this.horasDeInvestigacion = p_horasEx;
    }
    public void mostrarCargo(){
        
    }
    
}