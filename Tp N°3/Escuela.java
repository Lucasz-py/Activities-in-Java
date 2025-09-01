
/**
 * Class Escuela.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Escuela{
    private String nombre;
    private String domicilio;
    private String director;
    
    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public String getDirector(){
        return director;
    }
    
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: "+this.getNombre()+"\t"+"Domicilio: "+this.getDomicilio()+"\t"+"Director: "+this.getDirector());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Docente:    "+p_docente.getNombre());
        System.out.println("Sueldo .............................     $"+p_docente.calcularSueldo());
        System.out.println("Sueldo Basico: .....................     $"+p_docente.getSueldoBasico());
        System.out.println("Asignacion familiar ................     $"+p_docente.getAsignacion());
    }
}