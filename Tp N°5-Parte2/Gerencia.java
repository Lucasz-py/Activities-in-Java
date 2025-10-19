import java.util.ArrayList;
/**
 * Write a description of class Gerencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gerencia{
    private String nombre;
    private ArrayList<Alojamiento> alojamientosAlquilados;
    
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alquilados){
        this.setNombre(p_nombre);
        this.setAlojamientosAlquilados(p_alquilados);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alquilados){
        this.alojamientosAlquilados = p_alquilados;
    }
    
    public ArrayList<Alojamiento> getAlojamientosAlquilados(){
        return this.alojamientosAlquilados;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.getAlojamientosAlquilados().add(p_alojamiento);
    }
    public boolean quitarAlojamiento(Alojamiento p_alogamiento){
        return this.getAlojamientosAlquilados().remove(p_alogamiento);
    }
    
    public int contarAlojamiento(String tipoAlojamiento){
        int contador = 0;
        for(Alojamiento alojamiento : this.getAlojamientosAlquilados()){
            contador += alojamiento.contar(tipoAlojamiento);
        }
        return contador;
    }
    
    public void liquidar(){
        for(Alojamiento alojamiento : this.getAlojamientosAlquilados()){
            alojamiento.liquidar();
        }
    }
    
    public void mostrarLiquidacion(){
        System.out.println("Gerencia " + this.getNombre());
        System.out.println("Liquidación-------------------");
        this.liquidar();
        System.out.println("\n-----------------------------------");
        System.out.println("Alojamiento tipo Cabaña ---->" + this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ------->" + this.contarAlojamiento("Hotel"));
    }
}