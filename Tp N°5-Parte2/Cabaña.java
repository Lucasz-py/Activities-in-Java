import java.util.ArrayList;
/**
 * Write a description of class Cabaña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cabaña extends Alojamiento{
    private int nroHabitacion;
    
    public Cabaña(String p_nombre, double p_precioBase, int p_dias, ArrayList<Servicio> p_servicio, int p_nroH){
        super(p_nombre, p_precioBase, p_dias, p_servicio);
        this.setNroHabitacion(p_nroH);
    }
    
    private void setNroHabitacion(int p_nroH){
        this.nroHabitacion = p_nroH;
    }
    public int getNroHabitacion(){
        return this.nroHabitacion;
    }
    
    public double costo(){
        int costoExtraPorHabitaciones = this.getNroHabitacion() * 30 * super.getDiasAlquiler();
        return super.costo() + costoExtraPorHabitaciones + super.costoServicios();
    }
    
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Cabaña")){
            return 1;
        } else {
            return 0;
        }
    }
    
    public void liquidar(){
        super.liquidar();
        System.out.println("\nCabaña con "+this.getNroHabitacion()+" Habitaciones");
        System.out.println("Total: ------> $"+this.costo());
    }
}