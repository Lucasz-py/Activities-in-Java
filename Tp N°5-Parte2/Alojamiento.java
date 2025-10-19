import java.util.ArrayList;
/**
 * Write a description of class Alojamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Alojamiento{
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> servicio;
    
    public Alojamiento(String p_nombre, double p_precioBase, int p_dias, ArrayList<Servicio> p_servicio){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_dias);
        this.setServicio(p_servicio);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setPrecioBase(double p_precioBase){
        this.precioBase = p_precioBase;
    }
    private void setDiasAlquiler(int p_dias){
        this.diasAlquiler = p_dias;
    }
    private void setServicio(ArrayList<Servicio> p_servicio){
        this.servicio = p_servicio;
    }
 
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecioBase(){
        return this.precioBase;
    }
    public int getDiasAlquiler(){
        return this.diasAlquiler;
    }
    public ArrayList<Servicio> getServicio(){
        return this.servicio;
    }

    public boolean agregarServicio(Servicio p_servicio){
        return this.getServicio().add(p_servicio);
    }
    
    public boolean quitarServicio(Servicio p_servicio){
        return this.getServicio().remove(p_servicio);
    }
    
    public abstract int contar(String p_alojamiento);
    
    public double costo(){
        return this.getPrecioBase() * this.getDiasAlquiler();
    }
    
    public void listarServicios(){
        for(Servicio ser : this.getServicio()){
            System.out.print(ser.getDescripcion()+": $"+ser.getPrecio()+ "\t");
        }
    }
    
    public double costoServicios(){
        double total = 0;
        for(Servicio ser : this.getServicio()){
            total += ser.getPrecio();
        }
        return total;
    }
    
    public void liquidar(){
        System.out.println("\n★Alojamiento: "+this.getNombre());
        System.out.println("Costo por "+this.getDiasAlquiler()+" dias: $"+(this.getPrecioBase() * this.getDiasAlquiler())+ " alquiler");
        this.listarServicios();        
    }
}