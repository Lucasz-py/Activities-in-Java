import java.util.ArrayList;
/**
 * Write a description of class Hotel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hotel extends Alojamiento{
    private String tipoHabitacion;
    
    public Hotel(String p_nombre, double p_precioBase, int p_dias, ArrayList<Servicio> p_servicio, String p_tipoH){
        super(p_nombre, p_precioBase, p_dias, p_servicio);
        this.setTipoHabitacion(p_tipoH);
    }
    
    private void setTipoHabitacion(String p_tipoH){
        this.tipoHabitacion = p_tipoH;
    }
    public String getTipoHabitacion(){
        return this.tipoHabitacion;
    }
    
     public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Hotel")){
            return 1;
        } else {
            return 0;
        }
    }
    
    public double costo(){
        double costoBase = super.costo(); // precioBase * dias
        double costoServicios = super.costoServicios();
        double costoExtraHabitacion = 0;
        
        if(this.getTipoHabitacion().equals("Single")){
            costoExtraHabitacion = super.getDiasAlquiler() * 20;
        } else if (this.getTipoHabitacion().equals("Doble")){
            costoExtraHabitacion = super.getDiasAlquiler() * 30;
        } else {
            System.out.println("Tipo de Habitacion Incorrecta");
        }
        
        return costoBase + costoExtraHabitacion + costoServicios;
    }
    
    public void liquidar(){
        super.liquidar();
        System.out.println("Habitacion: "+this.getTipoHabitacion());
        System.out.println("Total: ------> $"+this.costo());
    }
}