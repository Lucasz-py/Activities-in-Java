import java.util.ArrayList;
/**
 * Write a description of class Profesor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Profesor extends Persona{
    private String titulo;
    private ArrayList<Cargo> cargos;
    
    public Profesor(int p_nroDni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargo){
        super(p_nroDni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargo(p_cargo);
    }
    
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    private void setCargo(ArrayList<Cargo> p_cargo){
        this.cargos = p_cargo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public ArrayList<Cargo> getCargo(){
        return this.cargos;
    }
    
    public boolean agregarCargo(Cargo p_cargo) {
        return this.cargos.add(p_cargo);
    }
    public boolean quitarEmpleado(Cargo p_cargo) {
        if(this.getCargo().size() > 1){
            return this.getCargo().remove(p_cargo); 
        } else { 
            return false;
        }
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: "+this.getTitulo());
        System.out.println("\n");
        System.out.println("****** Cargos Asignados ******");
        System.out.println("----------------------------");
        this.listarCargos();
        System.out.println("\n");
        
    }
    
    public void listarCargos(){
        for (Cargo car : this.getCargo()){
            car.mostrarCargo();
        }
    }
    
    public double sueldoTotal(){
        double sueldoT = 0.0;
        for(Cargo car : this.getCargo()){
            sueldoT =+ car.getSueldoBasico();
        }
        return sueldoT;
    }
    
    public String mostrarLinea(){
        return "DNI: "+super.getDNI()+" - Nombre: "+super.getNombre()+" - Sueldo Total: "+this.sueldoTotal();
    }
}