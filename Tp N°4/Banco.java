import java.util.ArrayList;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleado;
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(new ArrayList<Empleado>());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(p_empleado);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setNroSucursal(int p_nro){
        this.nroSucursal = p_nro;
    }
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    private void setEmpleado(ArrayList<Empleado> p_empleado){
        this.empleado = p_empleado;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    public Localidad getLocalidad(){
        return this.localidad;
    }
    public ArrayList<Empleado> getEmpleado(){
        return this.empleado;
    }
    
    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.empleado.add(p_empleado);
    }

    public boolean quitarEmpleado(Empleado p_empleado) {
        if(this.getEmpleado().size() > 2){
            return this.getEmpleado().remove(p_empleado); 
        } else { 
            return false;
        }
    }
    
    public void listarSueldos(){
        for(Empleado e : this.getEmpleado()){
            System.out.println(e.mostrarLinea());
        }
    }
    
    public double sueldoAPagar(){
        double total = 0;
        for(Empleado e : this.getEmpleado()){
            total += e.sueldoNeto();
        }
        return total;
    }
    
    public void mostrar(){
        System.out.println("Banco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
        System.out.println(this.getLocalidad().mostrar());
        System.out.println("\n");
        this.listarSueldos();
        System.out.println("\n");
        System.out.println("Total a Pagar-----------------------------------"+this.sueldoAPagar());
    }
}