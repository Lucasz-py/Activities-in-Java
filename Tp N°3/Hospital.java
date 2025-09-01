
/**
 * Class Hospital.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Hospital{
    private String nombreHospital;
    private String nombreDirector;
    
    public Hospital(String p_nombre, String p_director){
        this.setNombre(p_nombre);
        this.setDirector(p_director);
    }
    
    private void setNombre(String p_nombre){
        this.nombreHospital = p_nombre;
    }
    private void setDirector(String p_director){
        this.nombreDirector = p_director;
    }
    
    public String getNombre(){
        return nombreHospital;
    }
    public String getDirector(){
        return nombreDirector;
    }
    
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombre() + "\t" + "Director: " + this.getDirector());
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Paciente: " + p_paciente.getNombre() + "\t" + "Historia Clinica: " + p_paciente.getHistoriaClinica() + "\t" + "Domicilio: "+ p_paciente.getDomicilio());
        System.out.println(p_paciente.getVive().mostrar());
    }
}