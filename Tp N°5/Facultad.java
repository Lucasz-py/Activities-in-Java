import java.util.ArrayList;
/**
 * Write a description of class Facultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Facultad{
    private String nombre;
    private ArrayList<Profesor> profesores;
    
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesor){
        this.setNombre(p_nombre);
        this.setProfesor(p_profesor);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre; 
    }
    private void setProfesor(ArrayList<Profesor> p_profesor){
        this.profesores = p_profesor;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Profesor> getProfesor(){
        return this.profesores;
    }
    
     public boolean agregarProfesor(Profesor p_profesor) {
        return this.profesores.add(p_profesor);
    }
     public boolean quitarEmpleado(Profesor p_profesor) {
        if(this.getProfesor().size() > 1){
            return this.getProfesor().remove(p_profesor); 
        } else { 
            return false;
        }
    }
    
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: "+ this.getNombre());
        System.out.println("------------------------------------------------------------------");
        for(Profesor prof : this.getProfesor()){
            System.out.println("DNI: "+prof.getDNI()+ " Nombre: "+prof.getNombre()+ " - Sueldo Total: "+prof.sueldoTotal());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Total a Pagar: $"+this.totalAPagar());
    }
    
    public double totalAPagar(){
        double total = 0.0;
        for(Profesor prof : this.getProfesor()){
            total += prof.sueldoTotal();
        }
        return total;
    }
    
    public void listarProfesorCargos(){
        System.out.println("***** Detalle de Profesores y cargos de Facultad: "+this.getNombre()+" *****");
        for(Profesor prof : this.getProfesor()){
            prof.mostrar();
        }
        System.out.println("Hay "+ this.getProfesor().size()+" Profesores");
    }
}